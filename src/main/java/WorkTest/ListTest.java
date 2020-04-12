package WorkTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther liyuhang
 * @date 2019/10/29 19:35
 */
public class ListTest {
    public static void main(String[] args) {
        List<String> a = new ArrayList<String>();
        a.add("0");
        a.add("1");
        a.add("2");
        a.set(1,"9");
        System.out.println(a.toString());
        String b= "SELECT\n" +
                "   a.`ACCOUNT_ID`,\n" +
                "   a.`USER_NAME`,\n" +
                "   a.`ID_NO`,\n" +
                "   a.`PHONE_NUMBER`,\n" +
                "   a.`ACCOUNT_STATE`,\n" +
                "   a.`ACCOUNT_TYPE`,\n" +
                "   a.`CREATER`,\n" +
                "   a.`ACCOUNT_BALANCE`,\n" +
                "   a.`PAY_PASSWORD`,\n" +
                "   a.`PAY_SECURITY_SET`,\n" +
                "   a.`ISNOT_CARDPAY`,\n" +
                "   a.`PATIENT_SEX`,\n" +
                "   a.`NATION`,\n" +
                "   a.`MARITAL_STATUS`,\n" +
                "   a.`BIRTHDAY`,\n" +
                "   a.`CERTIFICATE_TYPE`,\n" +
                "   a.`CERTIFICATE_NO`,\n" +
                "   a.`HOME_ADDRESS`,\n" +
                "   a.`BIRTH_PLACE`,\n" +
                "   a.`CREATER_NAME`,\n" +
                "   a.`CREATE_DATETIME`,\n" +
                "   a.`UPDATER`,\n" +
                "   a.`UPDATER_NAME`,\n" +
                "   a.`UPDATE_DATETIME`,\n" +
                "   a.`DEPOSIT`,\n" +
                "   a.`CUST_ACCT_ID`,\n" +
                "   a.`MEMBER_LEVEL`,\n" +
                "   a.`LEVEL_ID`,\n" +
                "   a.`BANK_ACCOUNT_ID`,\n" +
                "   a.`CONTACT_PHONE`,\n" +
                "   a.`CONTACT_NAME`,\n" +
                "   a.`JOB_ADDRESS`\n" +
                "FROM\n" +
                "sc_account_patient_hospital p LEFT JOIN sc_account_user a\n" +
                "ON p.ACCOUNT_ID=a.ACCOUNT_ID\n" +
                "WHERE\n" +
                "   1 = 1" +
                "    AND a.ACCOUNT_STATE=:state\n" +
                "    AND p.HIS_PATIENT_ID=:patientId\n" +
                "    AND p.HOSPITAL_ID=:hospitalId";

        String c = "SELECT\n" +
                // 增加字段
                "   sd.`ID`,\n" +
                "   sd.`ITEM_NO`,\n" +
                "   sd.`CLINIC_ORDER_NO`,\n" +
                "   sd.`PRESC_NO`,\n" +
                "   sd.`SERIAL_NO`,\n" +
                "   sd.`ITEM_NAME`,\n" +
                "   sd.`ITEM_CLASS`,\n" +
                "   sd.`ITEM_AMOUNT`,\n" +
                "   sd.`ITEM_UNIT`,\n" +
                "   sd.`ITEM_PRICE`,\n" +
                "   sd.`ITEM_COSTS`,\n" +
                "   sd.`ITEM_SPEC`,\n" +
                "   sd.`ITEM_CODE`,\n" +
                "   sd.`MEDICINE_WINDOW`,\n" +
                "   sd.`VISIT_NO`,\n" +
                "   sd.`DOCTOR_NAME`,\n" +
                "   sd.`RECEIPT_DEPT`,\n" +
                "   sd.`T_RECORD_ID`,\n" +
                "   sd.`EXECUTE_DEPT`,\n" +
                "   sd.`INVOICE_NO`,\n" +
                "   sd.`FEE_TYPE`,\n" +
                "   sd.`HOSPITAL_ID`,\n" +
                "   sd.`CREATER`,\n" +
                "   sd.`CREATER_NAME`,\n" +
                "   sd.`CREATE_DATETIME`,\n" +
                "   sd.`UPDATER`,\n" +
                "   sd.`UPDATER_NAME`,\n" +
                "   sd.`UPDATE_DATETIME`,\n" +
                "   sd.`HIS_PAY_FLAG`,\n" +
                "   sd.`EXEC_DEPT_CODE`,\n" +
                "   sd.`FORMULATION`,\n" +
                "   sd.`PER_DOSAGE`,\n" +
                "   sd.`FREQUENCY`,\n" +
                "   sd.`DOCTOR_CODE`,\n" +
                "   sd.`OWN_EXPENSE_FLAG`,\n" +
                "   sd.`ORIGIN`,\n" +
                "   sd.`USAGE_METHOD`,\n" +
                "   sd.`COMPOUND_FLAG`,\n" +
                "   sd.`DOSAGE_UNIT`,\n" +
                "   sd.`OTHER_HOSP_CHECK_FLAG`,\n" +
                "   sd.`USAGE_FLAG`,\n" +
                "   sd.`HIS_OPERATE_RETURN_TIME`,\n" +
                "   sd.`REFUND_ORDER_NO`,\n" +
                "   sd.`INSU_ITEM_NO`,\n" +
                "   sd.`INSU_ITEM_NAME`,\n" +
                "   sd.`CATALOG_TYPE`,\n" +
                "   sd.`LIMIT_DAYS`,\n" +
                "   sd.`INSU_CHECK_FLAG`,\n" +
                "   sd.`RECIPE_DETAIL_ID`,\n" +
                "   sd.`RECEIPT_DEPT_NO`,\n" +
                "   sd.`INVOICE_NO_ITEM_NAME`,\n" +
                "   sd.`INVOICE_NO_ITEM_CODE`,\n" +
                "   sd.`REAL_AMOUNT`,\n" +
                "   sd.`DISCOUNT`,\n" +
                "   sd.`pair`,\n" +
                "   sd.`CLASS_ID`,\n" +
                "   sd.`DOCTOR_ORDER_CODE`,\n" +
                "   sd.`DOCTOR_ORDER_NAME`,\n" +
                "   sd.`DOCTOR_ID_CARD`,\n" +
                "   sd.`SITEM_PRICE`,\n" +
                "(SELECT \n" +
                "GROUP_CONCAT(DISTINCT D.PAY_CHANNEL) \n" +
                "FROM \n" +
                "sc_busi_acct_detail D \n" +
                "WHERE V.ORDER_NO = D.ORDER_NO) AS PAY_CHANNELS," +
                "(SELECT \n" +
                "GROUP_CONCAT(DISTINCT D.TRAN_AMOUNT) \n" +
                "FROM \n" +
                "sc_busi_acct_detail D \n" +
                "WHERE V.ORDER_NO = D.ORDER_NO) AS TRAN_AMOUNT \n" +
                "FROM\n" +
                "   sc_payment_payrec_detail sd \n" +
                " LEFT JOIN sc_payment_payrec_master V \n" +
                " ON sd.CLINIC_ORDER_NO = V.CLINIC_ORDER_NO \n" +
                "WHERE\n" +
                "   FIND_IN_SET(sd.INVOICE_NO,:invoiceNo) \n" +
                "   AND sd.HOSPITAL_ID =:hospitalId";
        StringBuilder sql = new StringBuilder();
        sql.append(" SELECT HID.*, ")
                .append("       DEPT.DEPT_NAME,")
                .append("       UH.ID USE_ID,")
                .append("       DOCT.OPERATER_NAME DOCTOR_NAME,")
                .append("       SCH.CLINIC_DATE,")
                .append("       SCH.CLINIC_TYPE")
                .append("  FROM HOSP_REG_HID AS HID")
                .append("  INNER JOIN HOSP_DOCTOR_SCHEDULE AS SCH")
                .append("    ON HID.SCHEDULE_CODE = SCH.SCHEDULE_CODE")
                .append("   AND HID.HOSPITAL_ID = SCH.HOSPITAL_ID")
                .append("  LEFT JOIN HOSP_USER_USE_HID AS UH")
                .append("    ON UH.HID = HID.HID")
                .append("  LEFT JOIN HIS_DEPT AS DEPT")
                .append("    ON DEPT.HOSPITAL_ID = HID.HOSPITAL_ID")
                .append("   AND DEPT.DEPT_CODE = HID.DEPT_CODE")
                .append("  LEFT JOIN HIS_USER AS DOCT")
                .append("    ON DOCT.HOSPITAL_ID = HID.HOSPITAL_ID")
                .append("   AND DOCT.DEPT_CODE = HID.DEPT_CODE")
                .append("   AND DOCT.OPERATER_ID = HID.DOCTOR_CODE")
                .append(" WHERE HID.HOSPITAL_ID = :HOSPITAL_ID AND HID.HB_DATE >= CURDATE() ");
        sql.append(" AND HID.USED_FLAG = :USED_FLAG ")
                .append(" AND SCH.WORK_FLAG = :WORK_FLAG ")
                .append(" AND HID.DEPT_CODE = :DEPT_CODE ")
                .append(" AND HID.DOCTOR_CODE = :DOCTOR_CODE ")
                .append(" AND HID.CLINIC_DURATION = :CLINIC_DURATION ")
                .append(" AND HID.HB_TIME = :HB_TIME ");
        sql.append(" ORDER BY HID.HID LIMIT 0,1 ");
        String sql1 = "SELECT\n" +
                // 增加字段
                "   sd.`ID`,\n" +
                "   sd.`ITEM_NO`,\n" +
                "   sd.`CLINIC_ORDER_NO`,\n" +
                "   sd.`PRESC_NO`,\n" +
                "   sd.`SERIAL_NO`,\n" +
                "   sd.`ITEM_NAME`,\n" +
                "   sd.`ITEM_CLASS`,\n" +
                "   sd.`ITEM_AMOUNT`,\n" +
                "   sd.`ITEM_UNIT`,\n" +
                "   sd.`ITEM_PRICE`,\n" +
                "   sd.`ITEM_COSTS`,\n" +
                "   sd.`ITEM_SPEC`,\n" +
                "   sd.`ITEM_CODE`,\n" +
                "   sd.`MEDICINE_WINDOW`,\n" +
                "   sd.`VISIT_NO`,\n" +
                "   sd.`DOCTOR_NAME`,\n" +
                "   sd.`RECEIPT_DEPT`,\n" +
                "   sd.`T_RECORD_ID`,\n" +
                "   sd.`EXECUTE_DEPT`,\n" +
                "   sd.`INVOICE_NO`,\n" +
                "   sd.`FEE_TYPE`,\n" +
                "   sd.`HOSPITAL_ID`,\n" +
                "   sd.`CREATER`,\n" +
                "   sd.`CREATER_NAME`,\n" +
                "   sd.`CREATE_DATETIME`,\n" +
                "   sd.`UPDATER`,\n" +
                "   sd.`UPDATER_NAME`,\n" +
                "   sd.`UPDATE_DATETIME`,\n" +
                "   sd.`HIS_PAY_FLAG`,\n" +
                "   sd.`EXEC_DEPT_CODE`,\n" +
                "   sd.`FORMULATION`,\n" +
                "   sd.`PER_DOSAGE`,\n" +
                "   sd.`FREQUENCY`,\n" +
                "   sd.`DOCTOR_CODE`,\n" +
                "   sd.`OWN_EXPENSE_FLAG`,\n" +
                "   sd.`ORIGIN`,\n" +
                "   sd.`USAGE_METHOD`,\n" +
                "   sd.`COMPOUND_FLAG`,\n" +
                "   sd.`DOSAGE_UNIT`,\n" +
                "   sd.`OTHER_HOSP_CHECK_FLAG`,\n" +
                "   sd.`USAGE_FLAG`,\n" +
                "   sd.`HIS_OPERATE_RETURN_TIME`,\n" +
                "   sd.`REFUND_ORDER_NO`,\n" +
                "   sd.`INSU_ITEM_NO`,\n" +
                "   sd.`INSU_ITEM_NAME`,\n" +
                "   sd.`CATALOG_TYPE`,\n" +
                "   sd.`LIMIT_DAYS`,\n" +
                "   sd.`INSU_CHECK_FLAG`,\n" +
                "   sd.`RECIPE_DETAIL_ID`,\n" +
                "   sd.`RECEIPT_DEPT_NO`,\n" +
                "   sd.`INVOICE_NO_ITEM_NAME`,\n" +
                "   sd.`INVOICE_NO_ITEM_CODE`,\n" +
                "   sd.`REAL_AMOUNT`,\n" +
                "   sd.`DISCOUNT`,\n" +
                "   sd.`pair`,\n" +
                "   sd.`CLASS_ID`,\n" +
                "   sd.`DOCTOR_ORDER_CODE`,\n" +
                "   sd.`DOCTOR_ORDER_NAME`,\n" +
                "   sd.`DOCTOR_ID_CARD`,\n" +
                "   sd.`SITEM_PRICE`,\n" +
                "(SELECT \n" +
                "GROUP_CONCAT(DISTINCT D.PAY_CHANNEL) \n" +
                "FROM \n" +
                "sc_busi_acct_detail D \n" +
                "WHERE V.ORDER_NO = D.ORDER_NO) AS PAY_CHANNELS," +
                "(SELECT \n" +
                "GROUP_CONCAT(DISTINCT D.TRAN_AMOUNT) \n" +
                "FROM \n" +
                "sc_busi_acct_detail D \n" +
                "WHERE V.ORDER_NO = D.ORDER_NO) AS TRAN_AMOUNT \n" +
                "FROM\n" +
                "   sc_payment_payrec_detail sd \n" +
                " LEFT JOIN sc_payment_payrec_master V \n" +
                " ON sd.CLINIC_ORDER_NO = V.CLINIC_ORDER_NO \n" +
                "WHERE\n" +
                "   FIND_IN_SET(sd.INVOICE_NO,:invoiceNo) \n" +
                "   AND sd.HOSPITAL_ID =:hospitalId";
        System.out.println(sql1);
    }
}
