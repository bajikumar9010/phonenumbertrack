
import java.util.*;
class Dat{
    private String product;
    private double value;

    public   Dat(String product,double value)
    {
        this.product=product;
        this.value=value;
    }
    public double getvalue()
    {
        return value;
    }
    public String getproduct()
    {
        return product;
    }

    @Override
    public String toString()
    {
        return "{"+this.product+":"+this.value+"}";
    }
}
class A {
    public static void main(String args[]) throws Exception {
        List<Dat> sales_of_year2022 = new ArrayList<>();
        sales_of_year2022.add(new Dat("Tea", 120));
        sales_of_year2022.add(new Dat("Oolong Tea", 230));
        sales_of_year2022.add(new Dat("Green Tea", 60));
        sales_of_year2022.add(new Dat("Black tea", 210));
        sales_of_year2022.add(new Dat("Lemon soda", 205));

        List<Dat> sales_of_year2021 = new ArrayList<>();
        sales_of_year2021.add(new Dat("Tea", 100));
        sales_of_year2021.add(new Dat("Oolong Tea", 250));
        sales_of_year2021.add(new Dat("Green Tea", 50));
        sales_of_year2021.add(new Dat("Black tea.", 180));
        sales_of_year2021.add(new Dat("Lemon soda", 220));

        List<Double> variances = new ArrayList<>();
        List<Double> variancePcts= new ArrayList<>();

        double Total_sales_of_year2022 = sales_of_year2022.stream().mapToDouble(s->s.getvalue()).sum();
        System.out.println( " the  total sales of year  2022 is :"+Total_sales_of_year2022);

        for (int i = 0; i < sales_of_year2022.size(); i++) {
            variances.add(sales_of_year2022.get(i).getvalue() - sales_of_year2021.get(i).getvalue());
        }
        System.out.println(variances);

        for (int j = 0; j <  sales_of_year2022.size(); j++) {
            variancePcts.add(Math.abs(variances.get(j) / sales_of_year2022.get(j).getvalue()) * 100);
        }
        System.out.println(variancePcts);



    }
}
