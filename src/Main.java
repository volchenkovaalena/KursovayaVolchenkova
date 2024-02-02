public class Main {
    static Employee[] EmployeeArray = new Employee[10];

    public static void main ( String[] args ) {
        EmployeeArray[0] = new Employee ( "Иван", "Сергеевич", "Рязанцев", 79000, 1 );
        EmployeeArray[1] = new Employee ( "Светлана", "Игоревна", "Гурова", 81000, 2 );
        EmployeeArray[2] = new Employee ( "Игорь", "Михайлович", "Серов", 105000, 1 );
        EmployeeArray[3] = new Employee ( "Артем", "Денисович", "Макаров", 55000, 3 );
        EmployeeArray[4] = new Employee ( "Ольга", "Ивановна", "Будкова", 78000, 2 );
        EmployeeArray[5] = new Employee ( "Ирина", "Борисовна", "Шутова", 125000, 5 );
        EmployeeArray[6] = new Employee ( "Виктор", "Иванович", "Левин", 99000, 4 );
        EmployeeArray[7] = new Employee ( "Сергей", "Сергеевич", "Земцов", 45000, 3 );
        EmployeeArray[8] = new Employee ( "Елена", "Николаевна", "Сергеева", 51000, 3 );
        EmployeeArray[9] = new Employee ( "Святослав", "Игоревич", "Богдановский", 92000, 5 );

        printEmployee ( );
        calculateSumSalary ( );
        calculateMinSalary ( );
        calculateMaxSalary ( );
        calculateAverageSalary ( );
        printNames ();
    }

    public static void printEmployee () {
        for ( int i = 0; i < EmployeeArray.length; i++ ) {
            System.out.println ( EmployeeArray[i] );
        }
    }

    public static void calculateSumSalary () {
        int sumSalary = 0;
        for ( int i = 0; i < EmployeeArray.length; i++ ) {
            sumSalary = sumSalary + EmployeeArray[i].getSalary ( );


        }
        System.out.println ( sumSalary );
    }

    public static void calculateMinSalary () {
        int minSalary = EmployeeArray[0].getSalary ( );
        for ( int i = 0; i < EmployeeArray.length; i++ ) {
            if ( EmployeeArray[i].getSalary ( ) < minSalary ) {
                minSalary = EmployeeArray[i].getSalary ( );
            }
        }
        System.out.println ( minSalary );

    }

    public static void calculateMaxSalary () {
        int maxSalary = EmployeeArray[0].getSalary ( );
        for ( int i = 0; i < EmployeeArray.length; i++ ) {
            if ( EmployeeArray[i].getSalary ( ) > maxSalary ) {
                maxSalary = EmployeeArray[i].getSalary ( );
            }
        }
        System.out.println ( maxSalary );

    }

    public static void calculateAverageSalary () {
        int sumSalary = 0;
        int k = 0;
        int averageSalary;
        for ( int i = 0; i < EmployeeArray.length; i++ ) {
            sumSalary = sumSalary + EmployeeArray[i].getSalary ( );
            k = k + 1;
            }
            System.out.println (  sumSalary / k );
        }

        public static void printNames(){
            for ( int i = 0; i < EmployeeArray.length; i++ )
                System.out.println ( EmployeeArray[i].getName () + " " + EmployeeArray[i].getMiddleName () + " " + EmployeeArray[i].getSurname ());
        }
    }























