public class VikingFarmasi extends Bobotoh{
public void mendukung(){
System.out.println("Jangan rasis,,Rivalitas hanya 90 menit diluar itu semua SAUDARA!");
}

public static void main(String[] args){
Bobotoh bbt = new Bobotoh();
Viking vk = new Viking();
Bomber br = new Bomber();
VikingFarmasi vf = new VikingFarmasi();

bbt.mendukung();

bbt = vk;
bbt.mendukung();

bbt = br;
bbt.mendukung();

bbt = vf;
bbt.mendukung();
}
}