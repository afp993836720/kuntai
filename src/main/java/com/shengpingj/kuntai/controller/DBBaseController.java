package com.shengpingj.kuntai.controller;

import com.shengpingj.kuntai.common.FolderFileScanner;
import com.shengpingj.kuntai.pojo.vo.AjaxData;
import com.shengpingj.kuntai.pojo.vo.DBBase;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class DBBaseController {

    @RequestMapping("/admin/system/dbbase")
    public String dbbase(HttpSession session, Model model){
//        ArrayList<Object> objects = null;
      //  System.out.println(objects);
//        List<DBBase> dbBases = null;
       // System.out.println(dbBases);
        Integer otype = (Integer) session.getAttribute("otype");

        try {
            if (otype != null && otype == 3){
                ArrayList<Object> objects = FolderFileScanner.scanFilesWithRecursion("E:/java/Idea/idea_workspace/kuntai/src/dbbase");
                List<DBBase> dbBases = FolderFileScanner.showDBBase(objects);
                model.addAttribute("dbbases",dbBases);
                return "admin/system/dbbase";
            }else {
                return "admin/login/login";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "admin/login/login";
        }

    }
    @RequestMapping("/admin/system/backupsbase")
    @ResponseBody
    public AjaxData backupsbase(HttpSession session,String name,String tp){
        //System.out.println(name);
        //System.out.println(tp);
        Integer otype = (Integer) session.getAttribute("otype");
        if (otype != null && otype == 3){
            if ("del".equals(tp)){
                boolean b = FolderFileScanner.delDBBase(name);
                if (b){
                    return new AjaxData("删除成功",1);
                }
                return new AjaxData("删除失败",-1);
            }
            if ("backup".equals(tp)){
                boolean b = FolderFileScanner.dbbaseExp();
                if (b){
                    return new AjaxData("备份成功",1);
                }
                return new AjaxData("备份失败",-1);
            }
            return new AjaxData("操作失败",-1);
        }else {
            return new AjaxData("您无权访问,请提升权限后再来",-1);
        }

    }
    @RequestMapping("/admin/system/downloaddbbase")
    public void downloadDBBase(HttpSession session, String name, String tp, HttpServletResponse response){
        FolderFileScanner.downloadFile(response, tp+String.valueOf(new Date().getTime())+".sql",name);

    }
}
