package com.shengpingj.kuntai.common;

import com.shengpingj.kuntai.pojo.WP_Config;
import com.shengpingj.kuntai.pojo.vo.DBBase;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.*;

public class FolderFileScanner {
    private static ArrayList<Object> scanFiles = new ArrayList<Object>() ;

    public static ArrayList<Object> scanFilesWithRecursion(String folderPath) throws Exception {
        if (scanFiles.size()> 0){
            scanFiles.clear();
        }
        //System.out.println(scanFiles.size());
        //System.out.println(scanFiles);
        ArrayList<String> dirctorys = new ArrayList<String>();
        File dirctory = new File(folderPath);
        if (!dirctory.isDirectory()){
            throw new Exception('"'+folderPath+'"'+"input path is not a Directory");
        }
        if (dirctory.isDirectory()){
            File[] files = dirctory.listFiles();
            for (int i = 0; i < files.length ; i++) {
                if (files[i].isDirectory()){
                    dirctorys.add(files[i].getAbsolutePath());
                    scanFilesWithRecursion(files[i].getAbsolutePath());
                }else {
                    scanFiles.add(files[i].getAbsolutePath());
                }
            }
        }
        return scanFiles;
    }
    public static List<DBBase> showDBBase(ArrayList<Object> objects){
        List<DBBase> dbBases = new ArrayList<DBBase>();
        for (int i = 0; i < objects.size(); i++) {
            File file = new File(objects.get(i).toString());
            DBBase dbBase = new DBBase();
            dbBase.setFilename(file.getAbsolutePath());
            dbBase.setTime(IntegerConverDate.IntegerCovDate(file.lastModified()));
            dbBase.setId(i+1);
            dbBases.add(dbBase);
        }
        return dbBases;



    }
    public static boolean delDBBase(String realPath){
        File file = new File(realPath);
        if (file.exists()) {
            return file.delete();
        }
        return false;
    }
    public static void downloadFile(HttpServletResponse response, String fileName, String path){
        if (fileName != null) {
            //设置文件路径
            File file = new File(path);
            if (file.exists()) {
                response.setHeader("content-type", "application/octet-stream");
                response.setContentType("application/octet-stream");
                try {
                    response.setHeader("Content-Disposition", "attachment;filename="+new String(fileName.getBytes("utf-8"),"ISO-8859-1"));
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
                byte[] buffer = new byte[1024];
                FileInputStream fis = null;
                BufferedInputStream bis = null;
                try {
                    fis = new FileInputStream(file);
                    bis = new BufferedInputStream(fis);
                    OutputStream os = response.getOutputStream();
                    int i = bis.read(buffer);
                    while (i != -1) {
                        os.write(buffer, 0, i);
                        i = bis.read(buffer);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    if (bis != null) {
                        try {
                            bis.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (fis != null) {
                        try {
                            fis.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
    public static List<WP_Config> requestPutDB(HttpServletRequest request){
        Enumeration<String> parameterNames = request.getParameterNames();
        List<WP_Config> list = new ArrayList<WP_Config>();
        while (parameterNames.hasMoreElements()){
            String s = parameterNames.nextElement();
            String[] stringArray = splitByLine(s);
            WP_Config wp_config = new WP_Config();
            wp_config.setUpdateTime(String.valueOf(new Date().getTime()));
            wp_config.setId(Integer.valueOf(stringArray[1]));
            wp_config.setType(Byte.valueOf(stringArray[2]));
            wp_config.setValue(request.getParameter(s));
            list.add(wp_config);
        }
        return list;
    }
    public static String[] splitByLine(String str){
        return str.split("_");
    }
    public static List<String> upload(MultipartHttpServletRequest params){
        Iterator<String> fileNames = params.getFileNames();
        BufferedOutputStream stream = null;
        List<String> list = new ArrayList<String>();
        while(fileNames.hasNext()){
            String next = fileNames.next();
            MultipartFile multipartFile = params.getFile(next);
            if (!multipartFile.isEmpty()) {
                // System.out.println(1111);
                File file = new File("E:\\java\\Idea\\idea_workspace\\kuntai\\target\\classes\\static\\img\\" + String.valueOf(new Date().getTime()) + ".png");
                list.add(file.getName());
                try {
                    byte[] bytes = multipartFile.getBytes();
                    stream = new BufferedOutputStream(new FileOutputStream(
                            file));
                    stream.write(bytes);
                    stream.flush();
                } catch (Exception e) {
                    stream = null;
                }finally {
                    if (stream != null){

                        try {
                            stream.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
                }
            }
            return list;
    }

    public static boolean dbbaseExp(){
        //调用mysql的安装目录 的命令
        InputStream in = null;
        InputStreamReader reader = null;
        String instr;
        String outstr;
        FileOutputStream fos = null;
        StringBuffer sb = new StringBuffer("");
        BufferedReader br = null;
        OutputStreamWriter writer = null;
        try {
            Runtime runtime = Runtime.getRuntime();
            Process exec = runtime.exec("E:\\java\\mysql\\soft\\bin\\mysqldump -uroot -proot -hlocalhost sjp");
            in = exec.getInputStream();
            reader = new InputStreamReader(in, "utf-8");
            br = new BufferedReader(reader);
            while ((instr = br.readLine())!=null){
                sb.append(instr+"\r\n");
            }
            outstr = sb.toString();
            fos = new FileOutputStream("E:/java/Idea/idea_workspace/kuntai/src/dbbase/"+String.valueOf(new Date().getTime())+".sql");
            writer = new OutputStreamWriter(fos, "utf-8");
            writer.write(outstr);
            writer.flush();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }finally {


            try {
                if (in != null){
                    in.close();
                }
                if (reader!=null){
                    reader.close();
                }
                if (br != null){
                    br.close();
                }
                if (writer!=null){
                    writer.close();
                }
                if (fos != null){
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

}
