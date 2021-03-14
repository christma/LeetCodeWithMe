package JVM;

public class A {
    public static void main(String[] args) {
        Integer x = 5;
        int y = 5;

        System.out.println(y == x);
    }
}

//
//public JVM.A();
//        descriptor: ()V
//        flags: ACC_PUBLIC
//        Code:
//        stack=1, locals=1, args_size=1
//        0: aload_0
//        1: invokespecial #1                  // Method java/lang/Object."<init>":()V
//        4: return
//        LineNumberTable:
//        line 3: 0
//
//public static void main(java.lang.String[]);
//        descriptor: ([Ljava/lang/String;)V
//        flags: ACC_PUBLIC, ACC_STATIC
//        Code:
//        stack=3, locals=3, args_size=1
//        0: iconst_5
//        1: invokestatic  #2                  // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
//        4: astore_1
//        5: iconst_5
//        6: istore_2
//        7: getstatic     #3                  // Field java/lang/System.out:Ljava/io/PrintStream;
//        10: iload_2
//        11: aload_1
//        12: invokevirtual #4                  // Method java/lang/Integer.intValue:()I
//        15: if_icmpne     22
//        18: iconst_1
//        19: goto          23
//        22: iconst_0
//        23: invokevirtual #5                  // Method java/io/PrintStream.println:(Z)V
//        26: return
//        LineNumberTable:
//        line 5: 0
//        line 6: 5
//        line 8: 7
//        line 9: 26
//        StackMapTable: number_of_entries = 2
//        frame_type = 255 /* full_frame */
//        offset_delta = 22
//        locals = [ class "[Ljava/lang/String;", class java/lang/Integer, int ]
//        stack = [ class java/io/PrintStream ]
//        frame_type = 255 /* full_frame */
//        offset_delta = 0
//        locals = [ class "[Ljava/lang/String;", class java/lang/Integer, int ]
//        stack = [ class java/io/PrintStream, int ]
//        }

