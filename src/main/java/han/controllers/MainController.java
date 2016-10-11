//package han.controllers;
//
//import han.test.UserDao;
//import han.test.UsersEntity;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.core.env.Environment;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.io.BufferedOutputStream;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.nio.file.Paths;
//import java.util.Iterator;
//
//import han.varification.*;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//@Controller
//public class MainController {
//
//    // The Environment object will be used to read parameters from the
//    // application.properties configuration file
//    @Autowired
//    private Environment env;
//
//    @Autowired
//    private UserDao userDao;
//    private final Logger log = LoggerFactory.getLogger(this.getClass());
//
//    @RequestMapping("/")
//    public String index() {
//        return "index.html";
//    }
//
//    /**
//     * POST /uploadFile -> receive and locally save a file.
//     *
//     * @param uploadfile The uploaded file as Multipart file parameter in the
//     * HTTP request. The RequestParam name must be the same of the attribute
//     * "name" in the input tag with type file.
//     *
//     * @return An http OK status in case of success, an http 4xx status in case
//     * of errors.
//     */
//    @RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
//    @ResponseBody
//    public ResponseEntity<?> uploadFile(
//            @RequestParam("uploadfile") MultipartFile uploadfile) {
//
//        try {
//            // Get the filename and build the local file path
//            String filename = uploadfile.getOriginalFilename();
//            String directory = env.getProperty("user.dir");
//            String filepath = Paths.get(directory, filename).toString();
//
//            System.out.printf("file name is: %s%n", filepath);
//
//            // Save the file locally
//            BufferedOutputStream bos =
//                    new BufferedOutputStream(new FileOutputStream(new File(filepath)));
//            bos.write(uploadfile.getBytes());
//            bos.close();
//            log.error("file is saved locally");
//            //Read file
//            FileInputStream file = new FileInputStream(new File(filepath));
//            XSSFWorkbook workbook = new XSSFWorkbook(file);
//            XSSFSheet sheet = workbook.getSheetAt(0);
//            int noOfColumns = sheet.getRow(0).getPhysicalNumberOfCells();
//            if(noOfColumns != 3) {
//                return ResponseEntity
//                        .status(HttpStatus.FORBIDDEN)
//                        .body("Wrong format!");
//            }
//
//            Iterator<Row> rowIterator = sheet.iterator();
//            rowIterator.next();
//            while(rowIterator.hasNext()) {
//                Row nextRow = rowIterator.next();
//                Iterator<Cell> cellIterator = nextRow.cellIterator();
//                String username = "", password = "", email = "";
//                username = nextRow.getCell(0).getStringCellValue();
//                System.out.printf("%s%n", nextRow.getCell(0).getStringCellValue());
//                switch (nextRow.getCell(1).getCellType()) {
//                    case Cell.CELL_TYPE_STRING:
//                        System.out.printf("%s%n", nextRow.getCell(1).getStringCellValue());
//                        password = nextRow.getCell(1).getStringCellValue();
//                        break;
//                    case Cell.CELL_TYPE_NUMERIC:
//                        System.out.printf("%d%n", nextRow.getCell(1).getNumericCellValue());
//                        password = String.valueOf(nextRow.getCell(1).getNumericCellValue());
//                        break;
//                }
//                email = nextRow.getCell(2).getStringCellValue();
//                System.out.printf("%s%n", nextRow.getCell(2).getStringCellValue());
//                //System.out.printf("%s%n", );
//
//                UsersEntity user = userDao.
////                        new UsersEntity(username, MD5Hash.encriptInMD5(password), email);
//                userDao.save(user);
//            }
//        }
//        catch (Exception e) {
//            System.out.println(e.getMessage());
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        }
//
//        return new ResponseEntity<>(HttpStatus.OK);
//    } // method uploadFile
//
//
//}
