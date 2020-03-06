package app.assignment.two;

class Login {
    private User user;
    private UserDetail userDetail;
    private DataSource dataSource;

    public void auth(String name, String pass) {
        dataSource = new DataSource();
        user = dataSource.getUser(name);
        userDetail = user.getUserDeteail();
    }

    public void status() {
        System.out.println(userDetail.getName());
        System.out.println(userDetail.getEmail());
        System.out.println(userDetail.getDateOfBirth());
    }
}