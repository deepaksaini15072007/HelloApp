/*	public static void main (String[] args){
		String name = args[0];
		System.out.println("Hello, " + name + "!");
	}
}*/

/*public class HelloApp{
	public static void main(String[] args) {
		String name = (args.length>0)? args[0]:"World";
		System.out.println("Hello, " + name + "!");
	}
}*/
/*public class HelloApp {
    public static void main(String[] args) {
        String names;
        if (args.length > 0) {
            names = String.join(", ", args);
        } else {
            names = "World";
        }
        System.out.println("Hello, " + names + "!");
    }
}*/
/*public class HelloApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder names = new StringBuilder();
            for (String name : args) {
                if (names.length() > 0) {
                    names.append(", ");
                }
                names.append(name);
            }
            System.out.println("Hello, " + names + "!");
        }
    }
}*//*public class HelloApp {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder nameBuilder = new StringBuilder();
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }
            if (nameBuilder.length() > 0) {
                String names = nameBuilder.substring(0, nameBuilder.length() - 2);
                System.out.println("Hello, " + names + "!");
            }
        }
    }
}*/
public class HelloApp {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            String names = String.join(", ", args);
            System.out.println("Hello, " + names + "!");
        }

      
    }
}