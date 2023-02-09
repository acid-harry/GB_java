 // Задать одномерный массив и найти в нем минимальный и максимальный элементы

        public static void task1( int[] arr){
            int max = arr[0];
            int min = arr[0];

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            System.out.println(max);
            System.out.println(min);
        }