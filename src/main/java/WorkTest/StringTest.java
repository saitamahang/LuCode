package WorkTest;

public class StringTest {
    public static void main(String[] args) {
        StringBuffer sql = new StringBuffer();
        sql.append("SELECT sppd.ID,sppd.ITEM_NO,sppd.CLINIC_ORDER_NO,sppd.PRESC_NO,sppd.SERIAL_NO,sppd.ITEM_NAME,"
                + "sppd.ITEM_CLASS,sppd.ITEM_AMOUNT,sppd.ITEM_UNIT,sppd.ITEM_PRICE,sppd.ITEM_COSTS,sppd.ITEM_SPEC,"
                + "sppd.ITEM_CODE,sppd.MEDICINE_WINDOW,sppd.VISIT_NO,sppd.DOCTOR_NAME,sppd.RECEIPT_DEPT,"
                + "sppd.T_RECORD_ID,sppd.EXECUTE_DEPT,sppd.INVOICE_NO,sppd.FEE_TYPE,sppd.RECIPE_DETAIL_ID,sppd.HIS_PAY_FLAG "
                + "FROM sc_payment_payrec_detail AS sppd , sc_payment_payrec_master sppm\n" +
                "  WHERE sppd.CLINIC_ORDER_NO = sppm.CLINIC_ORDER_NO\n" +
                "  AND sppm.HOSPITAL_ID = sppd.HOSPITAL_ID " +
                "  AND sppd.RECIPE_DETAIL_ID  = :recipeDetailId " +
                "  AND sppm.HIS_PAY_FLAG = :HIS_PAY_FLAG");

        System.out.println(sql.toString());
    }
}
