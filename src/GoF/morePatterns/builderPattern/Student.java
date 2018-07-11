package GoF.morePatterns.builderPattern;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.morePatterns.builderPattern
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/7/10/010 20:37
 * @UpdateDate: 2018/7/10/010 20:37
 */
public class Student {

    private int id;
    private String name;
    private String password;
    private String sex;
    private String address;

    public Student(int id, String name, String password, String sex, String address) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.sex = sex;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
