package hmarinjr.PizzaDelivery.Entity;

import java.util.ArrayList;
import java.util.Calendar;

public class Sale 
{
    int id;
    Client client;
    ArrayList<Product> products;
    Double value;
    PaymentType paymentType;
    Double discount;
    SaleType type;
    Calendar ordered;
}
