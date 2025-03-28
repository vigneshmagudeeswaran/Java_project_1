public class Consumer{
String channelName;
String program;
public static void main(String[] args){
Consumer tv_watcher = new Consumer();
tv_watcher.channelName = "vijay tv";
tv_watcher.program ="kalakapovathu yaaru";

TV samsung = new TV();
samsung.watch(tv_watcher);
}
}
