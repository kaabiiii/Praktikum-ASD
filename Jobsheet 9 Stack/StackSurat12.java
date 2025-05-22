public class StackSurat12 {
    Surat12[] data = new Surat12[100]; 
    int top = -1;

    public void push(Surat12 s) {
        if (top < data.length - 1) {
            top++;
            data[top] = s;
        } else {
            System.out.println("Stack penuh.");
        }
    }

    public Surat12 pop() {
        if (top >= 0) {
            Surat12 s = data[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong.");
            return null;
        }
    }

    public Surat12 peek() {
        if (top >= 0) {
            return data[top];
        } else {
            System.out.println("Stack kosong.");
            return null;
        }
    }

    public Surat12 cariSurat(String nama) {
        for (int i = top; i >= 0; i--) {
            if (data[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                return data[i];
            }
        }
        return null;
    }
}
