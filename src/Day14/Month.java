package Day14;

/**
 * @author 18124
 * （1）创建：1-12月常量对象
 * JANUARY,FEBRUARY,MARCH,APRIL,MAY,JUNE,JULY,AUGUST,SEPTEMBER,OCTOBER,NOVEMBER,DECEMBER
 * （2）声明两个属性：value（月份值，例如：JANUARY的value为1），
 * 					 description（描述，例如：JANUARY的description为1月份是一年的开始）。
 * （3）声明一个有参构造，创建12个对象
 * （4）声明一个方法：public static Month getByValue(int value)
 * （5）手动重写toString()：返回对象信息，例如：1->JANUARY->1月份是一年的开始。
 */

public enum Month {
    JANUARY(1,"一月"),FEBRUARY(2,"二月"),MARCH(3,"三月"),APRIL(4,"四月"),
    MAY(5,"五月"),JUNE(6,"六月"),JULY(7,"七月"),AUGUST(8,"八月"),
    SEPTEMBER(9,"九月"),OCTOBER(10,"十月"),NOVEMBER(11,"十一月"), DECEMBER(12, "十二月"),;
    private int value;
    private String description;

    Month(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public static Month getByValue(int value) {
        Month[] months = Month.values();
        for (int i = 0; i < months.length; i++) {
            if (months[i].value == value) {
                return months[i];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return value+"->"+this.name()+"->"+description;
    }
}
