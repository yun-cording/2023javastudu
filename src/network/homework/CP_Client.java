package network.homework;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;
import network.homework_db.DAO;
import network.homework_db.VO;

public class CP_Client extends Thread {
	Socket s;
	DB_Server server;
	ObjectInputStream in;
	ObjectOutputStream out;
	
	public CP_Client(Socket s , DB_Server server) {
		this.s = s;
		this.server = server;
		try {
			in = new ObjectInputStream(s.getInputStream());
			out = new ObjectOutputStream(s.getOutputStream());
		} catch (Exception e) {
		}
	}
	
	public void run() {
		esc: while(true) {	// 1.전체보기, 2.삽입하기, 3.삭제, 4.검색, 5.고치기
			try {
				Object obj = in.readObject();
				if(obj != null) {
					
					Protocol p = (Protocol)obj;
					switch (p.getCmd()) {
					case 0:
						out.writeObject(p);
						out.flush();
						break esc;
					case 1:
						List<VO> list = DAO.getList();
						p.setList(list);
						out.writeObject(p);
						out.flush();
						break;
					case 2:
						List<VO> list2 = DAO.getList();
						p.setList(list2);
						out.writeObject(p);
						out.flush();
						break;
					case 3:
						break;
					case 4:
						break;
					case 5:
						break;
					}
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		}// 와일문 끝
		try {
			out.close();
			in.close();
			s.close();
		} catch (Exception e) {
		}
	}
	
}
