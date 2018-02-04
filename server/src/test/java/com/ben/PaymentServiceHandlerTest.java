package com.ben;

//import com.ben.Customer;
//import com.ben.Payment;
//import com.ben.Status;
//import com.ben.server.PaymentServiceHandler;
//import com.ben.server.PaymentServiceHandler;
//import org.apache.thrift.TException;
//import org.junit.Before;
//import org.junit.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.mockito.stubbing.Answer;
//
//import java.util.Calendar;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNull;
//import static org.mockito.AdditionalAnswers.returnsFirstArg;
//import static org.mockito.Matchers.isA;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;

public class PaymentServiceHandlerTest {
//
//    @Mock
//    private static PaymentServiceHandler paymentService;
//
//    @InjectMocks
//    private static PaymentServiceHandler paymentServiceHandler;
//
//    @Before
//    public void setup() {
//        paymentServiceHandler = new PaymentServiceHandler();
//        MockitoAnnotations.initMocks(this);
//    }
//
//    @Test
//    public void testCreatePayment() throws TException {
//        when(paymentService.createPayment(isA(Payment.class)))
//                .thenAnswer((Answer<Payment>) invocation -> {
//                    Object[] args = invocation.getArguments();
//                    Payment payment = (Payment) args[0];
//                    payment.setStatus(Status.SCHEDULED);
//                    return payment;
//                });
//
//        Calendar calendar = Calendar.getInstance();
//        calendar.add(Calendar.DATE, 1);
//
//        Customer customer = new Customer("Tom", "Jones", 750);
//        Payment payment = new Payment("9.99", customer, calendar.getTime().toString(), null);
//
//        Payment paymentResponse = paymentServiceHandler.createPayment(payment);
//        assertEquals(Status.SCHEDULED, paymentResponse.getStatus());
//        verify(paymentService).createPayment(isA(Payment.class));
//    }
//
//    @Test
//    public void testCreatePaymentWithInvalidPastDate() throws TException {
//        when(paymentService.createPayment(isA(Payment.class)))
//                .thenAnswer(returnsFirstArg());
//
//        Calendar calendar = Calendar.getInstance();
//        calendar.add(Calendar.DATE, 1);
//
//        Customer customer = new Customer("Tom", "Jones", 750);
//        Payment payment = new Payment("9.99", customer, calendar.getTime().toString(), null);
//
//        Payment paymentResponse = paymentServiceHandler.createPayment(payment);
//        assertNull(paymentResponse.getStatus());
//    }
}
