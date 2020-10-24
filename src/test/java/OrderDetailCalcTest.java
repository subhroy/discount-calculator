import com.discount.calculator.model.OrderDetails;
import com.discount.calculator.service.impl.FinalBillServiceImpl;
import com.discount.calculator.util.CustomerType;
import org.junit.Test;
import org.junit.Assert;


public class OrderDetailCalcTest {

    @Test
    public void assertDiscountRulePremiumCustomerInputAmountFourThousand() throws Exception {

        FinalBillServiceImpl finalBillService = new FinalBillServiceImpl();
        OrderDetails orderObj = new OrderDetails(4000.00, CustomerType.PREMIUM);

        Assert.assertEquals(3600.00, finalBillService.calculateFinalBillAmount(orderObj), 2);
    }

    @Test
    public void assertDiscountRulePremiumCustomerInputAmountEightThousand() throws Exception {

        FinalBillServiceImpl finalBillService = new FinalBillServiceImpl();
        OrderDetails orderObj = new OrderDetails(8000.00, CustomerType.PREMIUM);

        Assert.assertEquals(7000.00, finalBillService.calculateFinalBillAmount(orderObj), 2);
    }

    @Test
    public void assertDiscountRulePremiumCustomerInputAmountTweleveThousand() throws Exception {

        FinalBillServiceImpl finalBillService = new FinalBillServiceImpl();
        OrderDetails orderObj = new OrderDetails(12000.00, CustomerType.PREMIUM);


        Assert.assertEquals(10200.00, finalBillService.calculateFinalBillAmount(orderObj), 2);
    }

    @Test
    public void assertDiscountRulePremiumCustomerInputAmountTwentyThousand() throws Exception {

        FinalBillServiceImpl finalBillService = new FinalBillServiceImpl();
        OrderDetails orderObj = new OrderDetails(20000.00, CustomerType.PREMIUM);

        Assert.assertEquals(15800.00, finalBillService.calculateFinalBillAmount(orderObj), 2);
    }

    @Test
    public void assertDiscountRuleRegularCustomerInputAmountFiveThousand() throws Exception {

        FinalBillServiceImpl finalBillService = new FinalBillServiceImpl();
        OrderDetails orderObj = new OrderDetails(5000.00, CustomerType.REGULAR);

        Assert.assertEquals(5000.00, finalBillService.calculateFinalBillAmount(orderObj), 2);
    }

    @Test
    public void assertDiscountRuleRegularCustomerInputAmountTenThousand() throws Exception {

        FinalBillServiceImpl finalBillService = new FinalBillServiceImpl();
        OrderDetails orderObj = new OrderDetails(10000.00, CustomerType.REGULAR);

        Assert.assertEquals(9500.00, finalBillService.calculateFinalBillAmount(orderObj), 2);
    }

    @Test
    public void assertDiscountRuleRegularCustomerInputAmountFifteenThousand() throws Exception {

        FinalBillServiceImpl finalBillService = new FinalBillServiceImpl();
        OrderDetails orderObj = new OrderDetails(15000.00, CustomerType.REGULAR);

        Assert.assertEquals(13500.00, finalBillService.calculateFinalBillAmount(orderObj), 2);
    }

    @Test
    public void assertDiscountRuleRegularCustomerInputAmountNineThousand() throws Exception {

        FinalBillServiceImpl finalBillService = new FinalBillServiceImpl();
        OrderDetails orderObj = new OrderDetails(9000.00, CustomerType.REGULAR);

        Assert.assertEquals(8600.00, finalBillService.calculateFinalBillAmount(orderObj), 2);
    }
    @Test
    public void assertDiscountRulePremiumCustomerInputAmountNineThousand() throws Exception {

        FinalBillServiceImpl finalBillService = new FinalBillServiceImpl();
        OrderDetails orderObj = new OrderDetails(9000.00, CustomerType.PREMIUM);

        Assert.assertEquals(7800.00, finalBillService.calculateFinalBillAmount(orderObj), 2);
    }

    @Test
    public void assertDiscountRulePremiumCustomerInputAmountNineThousandFiveHundred() throws Exception {

        FinalBillServiceImpl finalBillService = new FinalBillServiceImpl();
        OrderDetails orderObj = new OrderDetails(9500.00, CustomerType.PREMIUM);

        Assert.assertEquals(8200.00, finalBillService.calculateFinalBillAmount(orderObj), 2);
    }
    @Test
    public void assertDiscountRulePremiumCustomerInputAmountFiftyThousandFiveHundred() throws Exception {

        FinalBillServiceImpl finalBillService = new FinalBillServiceImpl();
        OrderDetails orderObj = new OrderDetails(50500.00, CustomerType.PREMIUM);

        Assert.assertEquals(37150.00, finalBillService.calculateFinalBillAmount(orderObj), 2);
    }


}
