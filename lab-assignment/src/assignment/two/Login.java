package assignment.two;

class Login {
    static Login instance = null;
    private User user;
    private UserDetail userDetail;
    private DataSource dataSource;

    private Login() {

    }

    static public Login getInstance() {
        if (instance == null)
            instance = new Login();
        return instance;
    }

    public void auth(String name, String pass) {
        dataSource = DataSource.getInstance();
        if ((user = dataSource.getUser(name)) != null) {
            if (user.getPassword().equals(pass)) {
                userDetail = user.getUserDeteail();
            } else {
                System.out.println("wrong password");
            }
        } else {
            System.out.println("user not found");
        }
    }

    public void status() {
        if (userDetail != null) {
            System.out.println(userDetail.getName());
            System.out.println(userDetail.getEmail());
            System.out.println(userDetail.getDateOfBirth());
        }
    }
}