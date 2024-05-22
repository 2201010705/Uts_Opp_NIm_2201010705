import java.util.Scanner;

public class ZooApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ZooVisitor[] visitors = new ZooVisitor[100]; // Menggunakan array untuk menyimpan data pengunjung
        int visitorCount = 0;

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Menu:");
            System.out.println("1. Tambah pengunjung");
            System.out.println("2. Tampilkan data pengunjung");
            System.out.println("3. Ubah data pengunjung");
            System.out.println("4. Hapus data pengunjung");
            System.out.println("5. Keluar");

            System.out.print("Pilih menu: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Membuang newline

            switch (choice) {
                case 1:
                    System.out.print("Nama pengunjung: ");
                    String name = scanner.nextLine();
                    System.out.print("Usia pengunjung: ");
                    int age = scanner.nextInt();
                    System.out.print("Nomor tiket: ");
                    int ticketNumber = scanner.nextInt();
                    visitors[visitorCount] = new ZooVisitor(name, age, ticketNumber);
                    visitorCount++;
                    break;
                case 2:
                    System.out.println("Data Pengunjung:");
                    for (int i = 0; i < visitorCount; i++) {
                        System.out.println((i + 1) + ". Nama: " + visitors[i].getName() + ", Usia: " + visitors[i].getAge() + ", Nomor Tiket: " + visitors[i].getTicketNumber());
                    }
                    break;
                case 3:
                    System.out.print("Masukkan nomor pengunjung yang akan diubah: ");
                    int indexToModify = scanner.nextInt() - 1;
                    scanner.nextLine(); // Membuang newline
                    if (indexToModify >= 0 && indexToModify < visitorCount) {
                        System.out.print("Nama baru: ");
                        name = scanner.nextLine();
                        System.out.print("Usia baru: ");
                        age = scanner.nextInt();
                        System.out.print("Nomor tiket baru: ");
                        ticketNumber = scanner.nextInt();
                        visitors[indexToModify].setName(name);
                        visitors[indexToModify].setAge(age);
                        visitors[indexToModify].setTicketNumber(ticketNumber);
                        System.out.println("Data pengunjung berhasil diubah.");
                    } else {
                        System.out.println("Nomor pengunjung tidak valid.");
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nomor pengunjung yang akan dihapus: ");
                    int indexToDelete = scanner.nextInt() - 1;
                    if (indexToDelete >= 0 && indexToDelete < visitorCount) {
                        for (int i = indexToDelete; i < visitorCount - 1; i++) {
                            visitors[i] = visitors[i + 1];
                        }
                        visitorCount--;
                        System.out.println("Data pengunjung berhasil dihapus.");
                    } else {
                        System.out.println("Nomor pengunjung tidak valid.");
                    }
                    break;
                case 5:
                    isRunning = false;
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
                    break;
            }
        }

        scanner.close();
    }
}
