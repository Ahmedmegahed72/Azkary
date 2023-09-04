package com.example.azkary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class list_actvity extends AppCompatActivity {
    ListView lv_show;

    ArrayList<String> message=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_actvity);

        lv_show=findViewById(R.id.lv_show);

        String []azkar={"دعاء الذهاب إلى المسجد\n","دعاء دخول المسجد\n","دعاء الخروج من المسجد\n","دعاء ُلبْس الثوب\n","دعاء لبس الثوب الجديد\n"
                ,"دعاء السفر\n","دعاء صلاة الاستخارة\n","دعاء الهم والحزن\n","دعاء الكرب\n","دعاء قضاء الدين\n","دعاء من استصعب عليه أمر\n",
                "دعاء رؤية الهلال\n","دعاء الركوب\n","دعاء من أصابه وسوسة في الإيمان\n","دعاء طرد الشيطان و وساوسه\n",
                "الدعاء للمريض في عيادته\n","دعاء من أصيب بمصيبة\n","دعاء التعزية\n","دعاء زيارة القبور\n","دعاء الرعد\n","الدعاء إذا نزل المطر\n",
                "الدعاء عند إفطار الصائم\n","دعاء الصائم إذا حضر الطعام ولم يفطر\n","الدعاء قبل الطعام\n","الدعاء عند الفراغ من الطعام\n",
                "دعاء الضيف لصاحب الطعام\n","دعاء العطاس\n","دعاء من رأى مبتلى\n","دعاء دخول القرية أو البلدة\n","دعاء دخول السوق\n"};

        ArrayAdapter<String> message_adapter=new ArrayAdapter<>(getApplicationContext(), R.layout.list_item,azkar);

        lv_show.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0)
                {
                    Intent intent=new Intent(list_actvity.this,D1.class);
                    intent.putExtra("azkar",lv_show.getItemAtPosition(position).toString());
                    startActivity(intent);
                }
                else if(position==1)
                {
                    Intent intent=new Intent(list_actvity.this,D2.class);
                    intent.putExtra("azkar",lv_show.getItemAtPosition(position).toString());
                    startActivity(intent);
                }
                else if(position==2)
                {
                    Intent intent=new Intent(list_actvity.this,D3.class);
                    intent.putExtra("azkar",lv_show.getItemAtPosition(position).toString());
                    startActivity(intent);
                }
                else if (position==3)
                {
                    Intent intent=new Intent(list_actvity.this,D4.class);
                    intent.putExtra("azkar",lv_show.getItemAtPosition(position).toString());
                    startActivity(intent);
                }

                else if (position==4)
                {
                    Intent intent=new Intent(list_actvity.this,D5.class);
                    intent.putExtra("azkar",lv_show.getItemAtPosition(position).toString());
                    startActivity(intent);
                }

                else if(position==5)
                {
                    Intent intent=new Intent(list_actvity.this,D6.class);
                    intent.putExtra("azkar",lv_show.getItemAtPosition(position).toString());
                    startActivity(intent);
                }

                else if(position==6)
                {
                    Intent intent=new Intent(list_actvity.this,D7.class);
                    intent.putExtra("azkar",lv_show.getItemAtPosition(position).toString());
                    startActivity(intent);
                }

                else if(position==7)
                {
                    Intent intent=new Intent(list_actvity.this,D8.class);
                    intent.putExtra("azkar",lv_show.getItemAtPosition(position).toString());
                    startActivity(intent);
                }

                else if(position==8)
                {
                    Intent intent=new Intent(list_actvity.this,D9.class);
                    intent.putExtra("azkar",lv_show.getItemAtPosition(position).toString());
                    startActivity(intent);
                }

                else if(position==9)
                {
                    Intent intent=new Intent(list_actvity.this,D10.class);
                    intent.putExtra("azkar",lv_show.getItemAtPosition(position).toString());
                    startActivity(intent);
                }

                else if(position==10)
                {
                    Intent intent=new Intent(list_actvity.this,D11.class);
                    intent.putExtra("azkar",lv_show.getItemAtPosition(position).toString());
                    startActivity(intent);
                }

                else if(position==11)
                {
                    Intent intent=new Intent(list_actvity.this,D12.class);
                    intent.putExtra("azkar",lv_show.getItemAtPosition(position).toString());
                    startActivity(intent);
                }


                else if(position==12)
                {
                    Intent intent=new Intent(list_actvity.this,D13.class);
                    intent.putExtra("azkar",lv_show.getItemAtPosition(position).toString());
                    startActivity(intent);
                }

                else if(position==13)
                {
                    Intent intent=new Intent(list_actvity.this,D14.class);
                    intent.putExtra("azkar",lv_show.getItemAtPosition(position).toString());
                    startActivity(intent);
                }

                else if(position==14)
                {
                    Intent intent=new Intent(list_actvity.this,D15.class);
                    intent.putExtra("azkar",lv_show.getItemAtPosition(position).toString());
                    startActivity(intent);
                }

                else if(position==15)
                {
                    Intent intent=new Intent(list_actvity.this,D16.class);
                    intent.putExtra("azkar",lv_show.getItemAtPosition(position).toString());
                    startActivity(intent);
                }

                else if(position==16)
                {
                    Intent intent=new Intent(list_actvity.this,D17.class);
                    intent.putExtra("azkar",lv_show.getItemAtPosition(position).toString());
                    startActivity(intent);
                }

                else if(position==17)
                {
                    Intent intent=new Intent(list_actvity.this,D18.class);
                    intent.putExtra("azkar",lv_show.getItemAtPosition(position).toString());
                    startActivity(intent);
                }

                else if(position==18)
                {
                    Intent intent=new Intent(list_actvity.this,D19.class);
                    intent.putExtra("azkar",lv_show.getItemAtPosition(position).toString());
                    startActivity(intent);
                }

                else if(position==19)
                {
                    Intent intent=new Intent(list_actvity.this,D20.class);
                    intent.putExtra("azkar",lv_show.getItemAtPosition(position).toString());
                    startActivity(intent);
                }


                else if(position==20)
                {
                    Intent intent=new Intent(list_actvity.this,D21.class);
                    intent.putExtra("azkar",lv_show.getItemAtPosition(position).toString());
                    startActivity(intent);
                }

                else if(position==21)
                {
                    Intent intent=new Intent(list_actvity.this,D22.class);
                    intent.putExtra("azkar",lv_show.getItemAtPosition(position).toString());
                    startActivity(intent);
                }

                else if(position==22)
                {
                    Intent intent=new Intent(list_actvity.this,D23.class);
                    intent.putExtra("azkar",lv_show.getItemAtPosition(position).toString());
                    startActivity(intent);
                }
                else if(position==23)
                {
                    Intent intent=new Intent(list_actvity.this,D24.class);
                    intent.putExtra("azkar",lv_show.getItemAtPosition(position).toString());
                    startActivity(intent);
                }

                else if(position==24)
                {
                    Intent intent=new Intent(list_actvity.this,D25.class);
                    intent.putExtra("azkar",lv_show.getItemAtPosition(position).toString());
                    startActivity(intent);
                }

                else if(position==25)
                {
                    Intent intent=new Intent(list_actvity.this,D26.class);
                    intent.putExtra("azkar",lv_show.getItemAtPosition(position).toString());
                    startActivity(intent);
                }

                else if(position==26)
                {
                    Intent intent=new Intent(list_actvity.this,D27.class);
                    intent.putExtra("azkar",lv_show.getItemAtPosition(position).toString());
                    startActivity(intent);
                }

                else if(position==27)
                {
                    Intent intent=new Intent(list_actvity.this,D28.class);
                    intent.putExtra("azkar",lv_show.getItemAtPosition(position).toString());
                    startActivity(intent);
                }

                else if(position==28)
                {
                    Intent intent=new Intent(list_actvity.this,D29.class);
                    intent.putExtra("azkar",lv_show.getItemAtPosition(position).toString());
                    startActivity(intent);
                }

                else if(position==29)
                {
                    Intent intent=new Intent(list_actvity.this,D30.class);
                    intent.putExtra("azkar",lv_show.getItemAtPosition(position).toString());
                    startActivity(intent);
                }




            }
        });

        lv_show.setAdapter(message_adapter);






    }
}