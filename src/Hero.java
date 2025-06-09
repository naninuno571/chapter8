public class Hero {
    String name;
    int hp;
    Sword sword;
    public Hero(String name){//newされた瞬間自動的に一回だけ呼び出される
        this.hp=100;
        this.name=name;
    }
    public Hero(){//オーバーロードで上のとは別と判断される
        /*this.hp=100;
        this.name="ダミー";*/
        //this.Hero("ダミー");上のを呼べるように見えるができない１
        this("ダミー");これならできる
    }
    public void sleep(){
        this.hp=100;
        System.out.println(this.name+"は、眠って回復した!");
    }
    public void sit(int sec){
        this.hp+=sec;
        System.out.println(this.name+"は"+sec+"秒座った！");
        System.out.println("HPが"+sec+"回復した");
    }
    public void slip(){
        this.hp-=5;
        System.out.println(this.name+"は、転んだ！");
        System.out.println("5のダメージ！");
    }
    public void run(){
        System.out.println(this.name+"は、逃げ出した！");
        System.out.println("GAMEOVER");
        System.out.println("最終HPは"+this.hp+"でした");
    }
}

