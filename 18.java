import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        employee e = new employee();
        System.out.println("worker detail");
        System.out.println("no of days of worker  - ");
        int worker_days = s.nextInt();
        worker w = new worker(3, 3004);
        int wp = w.payment(worker_days);
        System.out.println("payment of worker = " + wp);

        System.out.println("manager detail");
        System.out.println("no of days of manager -");
        int manager_days = s.nextInt();
        manager m = new manager(4, 4001);
        int mp = m.payment(manager_days);
        System.out.println("payment of manager = " + mp);

        System.out.println("other detail");
        System.out.println("no of days of other -");
        int others_days = s.nextInt();
        other o = new other(7, 7001);
        int op = o.payment(others_days);
        System.out.println("payment of manager = " + op);

    }
}

class employee {

}

class manager extends employee {
    manager(int did, int eid) {
        System.out.println("eid = " + did);
        System.out.println("eid = " + eid);
    }

    int payment(int manager_days) {
        return manager_days * 200;
    }
}

class worker extends employee {
    worker(int did, int eid) {
        System.out.println("eid = " + did);
        System.out.println("eid = " + eid);

    }

    int payment(int worker_days) {
        return worker_days * 300;
    }

}

class other extends employee {
    other(int did, int eid) {
        System.out.println("eid = " + did);
        System.out.println("eid = " + eid);

    }

    int payment(int others_days) {
        return others_days * 200;
    }
}