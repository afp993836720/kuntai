package com.shengpingj.kuntai.controller;

import com.shengpingj.kuntai.common.FolderFileScanner;
import com.shengpingj.kuntai.common.IntegerConverDate;
import com.shengpingj.kuntai.pojo.WP_Config;
import com.shengpingj.kuntai.pojo.vo.AjaxData;
import com.shengpingj.kuntai.service.WP_ConfigService;
import com.sun.jmx.snmp.SnmpUnknownModelLcdException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Controller
public class SetupController {
    @Autowired
    private WP_ConfigService webConfigService;
    @RequestMapping("admin/Setup/proportion")
    public String proportion(HttpSession session, Model model){
        Integer otype = (Integer) session.getAttribute("otype");
        if (otype!=null&&otype==3){

            List<WP_Config> list = webConfigService.selectWebConfigByGroupAndStatus(2,1);
            model.addAttribute("list",list);
            return "admin/Setup/index";
        }else{
            return "admin/login/login";
        }
    }
    @RequestMapping("/admin/Setup/deploy")
    public String deploy(HttpSession session, Model model,Integer id){
        Integer otype = (Integer) session.getAttribute("otype");
        if (otype!=null && otype ==3){
            List<WP_Config> list = webConfigService.selectWebConfigByGroupAndStatus(1, 1);
            for (int i = 0; i < list.size(); i++) {
                String time = list.get(i).getCreateTime();
                list.get(i).setCreateTime(IntegerConverDate.IntegerCovDate(Long.valueOf(time)));
            }
            List<WP_Config> configs = webConfigService.selectWebConfigByGroupAndStatus(2, 1);
            for (int i = 0; i < configs.size(); i++) {
                String time = configs.get(i).getCreateTime();
                configs.get(i).setCreateTime(IntegerConverDate.IntegerCovDate(Long.valueOf(time)));
            }
            model.addAttribute("list",list);
            model.addAttribute("res",configs);
            return "admin/Setup/deploy";
        }else{
            return "admin/login/login";
        }
    }
    @RequestMapping("/admin/Setup/deleteconf")
    @ResponseBody
    public AjaxData deleteConf(Integer id,HttpSession session){
        Integer otype = (Integer) session.getAttribute("otype");
        if (otype!=null && otype ==3) {
            boolean flag = webConfigService.deleteConf(id);
            if (flag) {
                return new AjaxData("删除成功", 1);
            }
            return new AjaxData("删除失败", -1);
        }
        return new AjaxData("权限不足",-1);
    }
    @RequestMapping("admin/Setup/updatesetup")
    @ResponseBody
    public AjaxData updateSetup(WP_Config wp_config,HttpSession session){
        Integer otype = (Integer) session.getAttribute("otype");
        if (otype!=null && otype ==3) {
            if (wp_config.getId() != null) {
                wp_config.setUpdateTime(String.valueOf(new Date().getTime()));
                boolean flag = webConfigService.updateConfigByConfig(wp_config);
                if (flag) {
                    return new AjaxData("修改成功", 1);
                }
                return new AjaxData("修改失败", -1);
            } else {
                wp_config.setCreateTime(String.valueOf(new Date().getTime()));
                boolean flag = webConfigService.insertConfigByConfig(wp_config);
                if (flag) {
                    return new AjaxData("添加成功", 1);
                }
                return new AjaxData("添加失败", -1);
            }
        }
        return new AjaxData("权限不足",-1);

    }
    @RequestMapping("admin/Setup/addsetup")
    public String addSetup(HttpSession session, Model model,Integer id){
        Integer otype = (Integer) session.getAttribute("otype");
        if (otype!=null && otype ==3){
            if (id != null){
                WP_Config wp_config = webConfigService.selectConfigById(id);
                model.addAttribute("vo",wp_config);
            }else{
                model.addAttribute("vo",new WP_Config());
            }
            return "admin/Setup/addsetup";
        }else{
            return "admin/login/login";
        }
    }
    @RequestMapping("/admin/Setup/index")
    public String setupIndex(Model model, HttpSession session){
        Integer otype = (Integer) session.getAttribute("otype");
        if (otype!=null&&otype==3){
            List<WP_Config> list = webConfigService.selectWebConfigByGroupAndStatus(1,1);
            model.addAttribute("list",list);
            return "admin/setup/index";
        }else {
            return "admin/login/login";
        }
    }
    @RequestMapping(value = "/admin/Setup/editconf",method = RequestMethod.POST)
 //   @ResponseBody
    public String editconf(HttpServletRequest request,MultipartHttpServletRequest params, HttpSession session){
        Integer otype = (Integer) session.getAttribute("otype");
        if (otype!=null&&otype==3){
            List<String> list = FolderFileScanner.upload(params);
            System.out.println(list);
            List<WP_Config> configs = FolderFileScanner.requestPutDB(request);
            if(list.size() > 0 ){
                configs.get(configs.size()-1).setValue("/img/"+list.get(1));
                configs.get(configs.size()-2).setValue("/img/"+list.get(0));

            }else{
                configs.get(configs.size()-1).setValue(webConfigService.selectValueById(configs.get(configs.size()-1).getId()));
                configs.get(configs.size()-1).setValue(webConfigService.selectValueById(configs.get(configs.size()-2).getId()));
            }
            boolean flag = webConfigService.updateConfigByList(configs);
            if (flag){
                return "forward:index";
            }
            return "forward:index";
        }else{
            return "admin/login/login";
        }
    }
}
