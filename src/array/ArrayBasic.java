package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayBasic {
    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0,0}; // 배열 생성
        int[] arr2 = new int[6]; // 위와 결과 값 동일, 기본 값은 0
        
        int[][] arr3 = {{1,2,3}, {4,5,6}}; // 2차원 배열
        int[][] arr4 = new int[2][3];
        
        /* Arrays.asList() 메서드를 이용해 정적 컬렉션 객체 생성
           List<제네릭 타입 지정> 참조 변수 = Arrays.asList(제네릭 타입 저장 데이터) 
           추가 또는 삭제는 불가능하고 변경만 가능하다*/
        List<Integer> aList = Arrays.asList(1,2,3,4);
        
        //List<E>의 구현 클래스: ArrayList<E>, Vector<E>, LinkedList<E>
        
        //List<E> 인터페이스 구현 클래스 생성자로 동적 컬렉션 객체 생성
        List<Integer> list = new ArrayList<>(); // ArrayList 생성
        list.add(3);
        list.add(5);
        list.add(7); // ArrayList에 추가
        list.remove(0); // index에 위치한 데이터 삭제
        list.get(0); //index에 위치한 데이터에 접근
    }
}
