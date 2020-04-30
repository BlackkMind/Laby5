package pl.kj.firstapp;

public class zad4 {


int wej[];
int e;

public zad4(int[] tab)
        {
            this.e=e;
           this.wej=wej;

        }
        public   boolean st(int wej[])
        {
            e=  wej.length;
            int pocz  = 0;
            int kon = wej.length-1;
            while (pocz < kon) {
                int help = wej[pocz];
                wej[pocz]  = wej[kon];
                wej[kon] = help;
                pocz++;
                kon--;

            }
            return e==wej.length;}
    }



