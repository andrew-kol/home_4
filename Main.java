public class Main {

    public static void main(String[] args) {

        //������� 1
        int a = 0;
        while (a < 10) {
            a++;
            System.out.print(a + " ");
        }
        System.out.print("\n");

        int f = 10;
        for (; f > 0; f--)
        {
            System.out.print(f+" ");
        }
        System.out.print("\n");

        //������� 2
        int c = 2;
        for (; c <= 31; c = c + 7) {
            System.out.println("������� ������� " + c + "-� �����.���������� ����������� �����.");
        }
        System.out.print("\n");


        //������� 3
        int l = 79;
        for (; l >= 2022 - 200; l = l + 79) {
            System.out.println(l);
        }

        int k = 79;
        for (; k <= 2022 + 100; k = k + 79) {
            System.out.println(k);
        }
    }
}