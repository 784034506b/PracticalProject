package view;

import java.util.List;
import java.util.Scanner;

import entity.BookInfo;
import service.BookInfoServiceInter;
import service.impl.BookInfoService;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		BookInfoServiceInter bookInfoService = new BookInfoService();
		BookInfo bookInfo = null;
		String message;
		BookInfo info;
		int Rank;
		String Title;
		String Price;
		String Press;
		while(true) {
			System.out.println("-------------------");
			System.out.println("|  ��ӭʹ��ͼ����Ϣ����ϵͳ   |");
			System.out.println("|1��ɾ��                                 |");
			System.out.println("|2����ѯ                                 |");
			System.out.println("|3������(���)                       |");
			System.out.println("|4������(����)                       |");
			System.out.println("|5���Ƽ�                                 |");
			System.out.println("|0���˳�                                 |");
			System.out.println("-------------------");
			try {
				System.out.print("��ѡ����(�����Ӧ����)��");
				int type = input.nextInt();
				switch(type) {
					case 1:
						System.out.print("��������Ҫɾ�������ţ�");
						Rank = input.nextInt();
						bookInfoService.removeBookInfo(Rank);
						break;
					case 2:
						bookInfoService.getAll();
						break;
					case 3:
						try {
							System.out.print("��������Ҫ�����ı�ţ�");
							Rank = input.nextInt();
							bookInfoService.getBookInfoByRank(Rank);
						} catch (Exception e) {
							// TODO: handle exception
							System.out.println("���������������Ӧѧ�ţ�");
							return;
						}
						break;
					case 4:
						try {
							System.out.print("��������Ҫ������������");
							Title = input.next();
							bookInfoService.getBookInfoByTitle(Title);
						} catch (Exception e) {
							// TODO: handle exception
							System.out.println("���������������Ӧ���֣�");
							return;
						}
						break;
					case 5:
						try {
							System.out.println("ͼ���Ƽ���");
							bookInfoService.recommend();
						} catch (Exception e) {
							// TODO: handle exception
							return;
						}
						break;
					case 0:
						System.out.println("ϵͳ�˳�");
						return;
					default:
						System.out.println("���ѡ����������������");
						break;
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("�����������������֣�");
				break;
			}
			
		}
	}

}

