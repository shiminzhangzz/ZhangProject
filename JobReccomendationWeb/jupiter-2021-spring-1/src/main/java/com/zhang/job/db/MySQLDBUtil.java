package com.zhang.job.db;

//public class MySQLDBUtil {
//    private static final String INSTANCE = "db-instance-2021-spring1.cezl7sntzzo8.us-east-2.rds.amazonaws.com";
//    private static final String PORT_NUM = "3306";
//    public static final String DB_NAME = "laiproject";
//    private static final String USERNAME = "admin";
//    private static final String PASSWORD = "9876543210";
//    public static final String URL = "jdbc:mysql://"
//            + INSTANCE + ":" + PORT_NUM + "/" + DB_NAME
//            + "?user=" + USERNAME + "&password=" + PASSWORD
//            + "&autoReconnect=true&serverTimezone=UTC";
//}
//
public class MySQLDBUtil {
//    private static final String INSTANCE = "db-instance-2021-spring1.cezl7sntzzo8.us-east-2.rds.amazonaws.com";
    private static final String INSTANCE =  "172.31.66.68";
    private static final String PORT_NUM = "3306";
    public static final String DB_NAME = "laiproject";
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "9876543210";
    public static final String URL = "jdbc:mysql://172.31.66.68:3306/laiproject?user=admin&password=9876543210&autoReconnect=true&serverTimezone=UTC"
          ;
}