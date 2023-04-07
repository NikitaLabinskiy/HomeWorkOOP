package HomeWorkSeminar4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class Calculator {
    public Double sum(List<? extends Number> list){
        double sum = 0.0;
        for (Number num: list) {
            sum += num.doubleValue();
        }
        return sum;
    }
    public Double productOfNumbers(List<? extends Number> list){
        double product = 1.0;
        for (Number num: list) {
            product *= num.doubleValue();
        }
        return product;
    }
    public Double differenceOfNumbers(List<? extends Number> list){
        double difference = Double.parseDouble(list.get(0).toString()); //???????? как работает парсинг.
        for (int i = 0; i < list.size() - 1; i++) {
            difference /= Double.parseDouble(list.get(i + 1).toString());
        }
        return difference;
    }
    public List<StringBuilder> binaryNumberFromDigits(List<? extends Number> list) {
        List<StringBuilder> resList = new ArrayList<>();
        for (Number value : list) {
            StringBuilder res = new StringBuilder();
            double number = Double.parseDouble(value.toString());
            while (number > 0) {
                if (number % 2 == 0) {
                    res.append("0");
                } else {
                    res.append("1");
                    number -= 1;
                }
                number /= 2;
            }
            resList.add(res.reverse());
        }
        return resList;
    }
    public List<StringBuilder> binaryNumberFromStrings(List<String> list) {
        List<StringBuilder> resList = new ArrayList<>();
        for (String value : list) {
            StringBuilder res = new StringBuilder();
            double number = Double.parseDouble(value);
            while (number > 0) {
                if (number % 2 == 0) {
                    res.append("0");
                } else {
                    res.append("1");
                    number -= 1;
                }
                number /= 2;
            }
            resList.add(res.reverse());
        }
        return resList;
    }

}
