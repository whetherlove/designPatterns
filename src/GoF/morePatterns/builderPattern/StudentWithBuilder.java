package GoF.morePatterns.builderPattern;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.morePatterns.builderPattern
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/7/10/010 20:37
 * @UpdateDate: 2018/7/10/010 20:37
 */
public class StudentWithBuilder {

    private int id;
    private String name;
    private String password;
    private String sex;
    private String address;

    public StudentWithBuilder() {
    }

    public StudentWithBuilder(StudentWithBuilder origin) {
        this.id = origin.id;
        this.name = origin.name;
        this.password = origin.password;
        this.sex = origin.sex;
        this.address = origin.address;
    }

    public static class Builder{

        private StudentWithBuilder target;

        public Builder() {
            target = new StudentWithBuilder();
        }

        public Builder id(int id) {
            target.id = id;
            return this;
        }

        public Builder name(String name) {
            target.name = name;
            return this;
        }

        public Builder password(String password) {
            target.password = password;
            return this;
        }

        public Builder sex(String sex) {
            target.sex = sex;
            return this;
        }

        public Builder address(String address) {
            target.address = address;
            return this;
        }

        public StudentWithBuilder build() {
            return new StudentWithBuilder(target);
        }
    }
}
