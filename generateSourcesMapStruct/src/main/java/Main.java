public class Main {
    public static void main(String[] args) {
        User user = new User("Diep", "Pham", "dp@gmail.com");
        //UserMapper mapper = new UserMapperImpl();
        UserCommand userCommand = UserMapper.INSTANCE.userToUserCommand(user);
        System.out.println(userCommand);
    }
}
