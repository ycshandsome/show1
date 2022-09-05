package com.example.show1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button bt1,bt2,bt3,bt4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1=findViewById(R.id.bt1);
        bt2=findViewById(R.id.bt2);
        bt3=findViewById(R.id.bt3);
        bt4=findViewById(R.id.bt4);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tvx=findViewById(R.id.tvx);
                TextView tvy=findViewById(R.id.tvy);
                TextView tvz=findViewById(R.id.tvz);

                tvx.setText("ウルトラマンギンガ");
                tvy.setText("银河·奥特曼，圆谷特摄剧《银河奥特曼》系列的主人公。来自未来的奥特曼，使用闪耀的等离子能量发挥出惊人力量的新世代奥特英雄。\n" +
                        "银河奥特曼平时将本体以人偶状态隐藏在银河火花里，当充满勇气的心与银河·奥特曼相呼应时，主人公礼堂光即与银河·奥特曼一体化，现出巨大化的身姿。自身也有意识，能脱离人间体的存在而活动；通常情况下战斗时间为3分钟，在遭遇危机时都会与礼堂光分离");
                tvz.setText("\n" +
                        "银河奥特曼技能介绍\n" +
                        "银河雷电击（ギンガサンダーボルト/Ginga Thunderbolt）\n" +
                        "新创华译名：银河闪电击\n" +
                        "银河聚集能源时，全身的水晶闪耀出黄色的光辉。首先从自身头部，双臂和胸口处向天空中释放闪电能量在自己上空产生雷云，之后集中并引导雷云中的闪电能量形成巨大螺旋星系的形状，然后用左手帮助稳定能量，再以右手放出聚集的电击对目标造成强大的电击伤害。");

            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tvx=findViewById(R.id.tvx);
                TextView tvy=findViewById(R.id.tvy);
                TextView tvz=findViewById(R.id.tvz);

                tvx.setText("ウルトラマンガイア");
                tvy.setText("《盖亚·奥特曼》是继《迪迦·奥特曼》和《戴拿·奥特曼》之后的作品，于1998年9月5日—1999年8月28日每周六18:00~18:30在每日放送和TBS电视台旗下系列电视台首播。 [1] \n" +
                        "盖亚·奥特曼代表的是大地的意志，而阿古茹·奥特曼代表的是海洋的意志。除了盖亚奥特曼以外，盖亚奥特曼的竞争对手阿古茹奥特曼以及一套全新的世界观剧情纷纷亮相。");
                tvz.setText("斯派修姆光线（スペシウム光线/Spacium Beam）\n" +
                        "将斯特利姆手镯的轮盘旋转至初代奥特曼的位置，借助初代奥特曼的力量释放斯派修姆光线。\n" +
                        "银河奥特曼S第3话中初次使用，将剩下半数的英普莱扎军团的士兵全歼； [24] \n" +
                        "第8话中对法伊布王使用时，破坏了其右手的雷丘巴斯部分； [25] \n" +
                        "第9话中再度使用来打倒了百慕拉（SD）； [28] \n" +
                        "第14话中对海帕杰顿（SD）使用，但被对方吸收并反弹了回来");

            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tvx=findViewById(R.id.tvx);
                TextView tvy=findViewById(R.id.tvy);
                TextView tvz=findViewById(R.id.tvz);

                tvx.setText("ウルトラセブン");
                tvy.setText("赛文·奥特曼是特摄剧《赛文·奥特曼》中的主人公，来自M78星云·光之国的恒星观测员340号，起初是为了制作轨道图而来到地球，在目睹一个青年的英勇事迹后见证了人类的勇气与善良，便以这个青年的样貌为原形，化名为诸星弹，自愿留在地球上；后来更加入奥特警备队，决心为保卫地球而战。 [1] \n" +
                        "赛文拥有众多不凡的格斗与光线技能，头部还装置有能通过脑波自由控制的武器·头镖，这些都让他在战斗中无往不利。作为奥特兄弟中的三哥、赛罗·奥特曼的父亲，赛文也是宇宙警备队身经百战的勇者。");
                tvz.setText("奥特射线（ウルトラショット/Ultra Shot）\n" +
                        "将斯特利姆手镯的轮盘旋转至杰克奥特曼的位置，借助杰克的力量释放奥特射线。\n" +
                        "第4话中初次使用消灭萨德拉（SD） [30]  ；\n" +
                        "第8话中对法伊布王使用时，破坏了其躯干上超戈布的部位。 [25] \n" +
                        "第12话中和维克特利姆射线搭配打败了佐亚穆鲁奇（SD）。 [31] \n" +
                        "第15话中对战维克特路基艾尔时，则是和维克特利的金古桥发射器打出组合技能，给予了维克特路基艾尔伤害。");

            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tvx=findViewById(R.id.tvx);
                TextView tvy=findViewById(R.id.tvy);
                TextView tvz=findViewById(R.id.tvz);

                tvx.setText("ウルトラマンギンガ");
                tvy.setText("银河·奥特曼，圆谷特摄剧《银河奥特曼》系列的主人公。来自未来的奥特曼，使用闪耀的等离子能量发挥出惊人力量的新世代奥特英雄。\n" +
                        "银河奥特曼平时将本体以人偶状态隐藏在银河火花里，当充满勇气的心与银河·奥特曼相呼应时，主人公礼堂光即与银河·奥特曼一体化，现出巨大化的身姿。自身也有意识，能脱离人间体的存在而活动；通常情况下战斗时间为3分钟，在遭遇危机时都会与礼堂光分离");
                tvz.setText("八分光轮（八つ裂き光轮/Dismembering Halo）\n" +
                        "又称：奥特切割（ウルトラスラッシュ/Ultra-Slash）\n" +
                        "将斯特利姆手镯的轮盘旋转至初代奥特曼的位置，借助初代奥特曼的力量释放八分光轮。\n" +
                        "在设定中银河斯特利姆形态能使用此技能，但在剧集中暂无使用记录。");

            }
        });
    }
}