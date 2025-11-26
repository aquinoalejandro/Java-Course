void main() {
        Random random = new Random();
        String chars = "abcdefghijklmnopqrstuvwxyz0123456789!@#$%";
        StringBuilder password = new StringBuilder(10);
        for (int i = 0; i < 10; i++) {
            int numeroAleatorio = random.nextInt(chars.length());
            password.append(chars.charAt(numeroAleatorio));
        }

        IO.println(password.toString());
}
