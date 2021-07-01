package com.example.myapplication1


import android.R.attr.button
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.Button
import android.widget.Toast
import java.util.*


class MainActivity : AppCompatActivity(), OnItemClickListner {

    private lateinit var rvDaata : RecyclerView
    private  var listMb: MutableList<Daata> = mutableListOf()
    private  var listAi: MutableList<Daata> = mutableListOf()
    private  var listWe: MutableList<Daata> = mutableListOf()
    private  var listUn: MutableList<Daata> = mutableListOf()
    private lateinit var btMb: Button
    private lateinit var btAi: Button
    private lateinit var btWe: Button
    private lateinit var btUn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adddtMb()
        adddtAi()
        adddtWe()
        adddtUn()
        btMb = findViewById(R.id.btnAn)
        btWe = findViewById(R.id.btnWeb)
        btAi = findViewById(R.id.btnAi)
        btUn = findViewById(R.id.btnUnity)
        rvDaata = findViewById(R.id.dataList)
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rvDaata.setLayoutManager(layoutManager)
        rvDaata.setHasFixedSize(true)
        dtAdapter(this, listMb,this).also { rvDaata.adapter = it }
        btMb.setOnClickListener(View.OnClickListener() {
            dtAdapter(this, listMb,this).also { rvDaata.adapter = it }
        })
        btAi.setOnClickListener(View.OnClickListener() {
            dtAdapter(this, listAi,this).also { rvDaata.adapter = it }
        })
        btWe.setOnClickListener(View.OnClickListener() {
            dtAdapter(this, listWe,this).also { rvDaata.adapter = it }
        })
        btUn.setOnClickListener(View.OnClickListener() {
            dtAdapter(this, listUn,this).also { rvDaata.adapter = it }
        })


}
    override fun onItemClick(item: Daata, position: Int) {
        val intent = Intent(this,MainActivityinfit::class.java )
        intent.putExtra("key_name", item.name)
        intent.putExtra("key_img", item.drawableResource.toString())
        intent.putExtra("key_class", item.class_Sc)
        intent.putExtra("key_note", item.note_like)
        intent.putExtra("key_like", item.like)
        intent.putExtra("key_infmm", item.infom)
        startActivity(intent)
    }
    private fun adddtUn() {
        listUn.add(
            Daata(
                "Nguyễn Văn Lực",
                "D19CQCN12-B",
                "Sở Thích: Game, nhạc, tấu hài, leve, ...",
                "Châm Ngôn Yêu Thích: Nothing is absolute.",
                R.drawable.u1,
                "Với tính cách vui vẻ cùng gương mặt hài hước, Lực luôn là chàng trai triển vọng cho những vai diễn kịch. Không những thế, Lực còn là người rất sáng tạo trong việc đưa ra các trò chơi và lên kịch bản cho những những sự kiện tại CLB."

            )
        )
        listUn.add(
            Daata(
                "Vương Đình Doanh",
                "D19CQCN09-B",
                "Sở Thích: Chơi cờ vua, nghe nhạc, làm game",
                "Châm Ngôn Yêu Thích: Love myself and be better.",
                R.drawable.u2,
                "Là một chàng trai ấm áp, nói ít làm nhiều, Đình Doanh đã khiến các em khóa dưới phải khóc thét mỗi khi làm contest."

            )
        )
        listUn.add(
            Daata(
                "Phạm Thị Nga",
                "D19CQCN04-B",
                "Sở Thích: Chụp ảnh, chơi board game, chơi game, đi chơi.",
                "Châm Ngôn Yêu Thích: Lost time is never found again.",
                R.drawable.u3,
                "“Nhỏ mà có võ” chắc chắn là câu nói đúng nhất để miêu tả về cô gái bé nhỏ nhưng đầy năng lượng này. Trong Nga luôn tiềm ẩn những ý tưởng, đóng góp sáng tạo giúp đưa hình ảnh CLB đến gần gũi với mọi người hơn."

            )
        )
    }

    private fun adddtWe() {
        listWe.add(
            Daata(
                "Nguyễn Văn Hậu",
                "D19CQCN02-B",
                "Sở Thích: Đi phượt, đi du lịch, đi ăn, mùa đồ không nhìn giá..",
                "Châm Ngôn Yêu Thích: Only your negative emotions are what hold you back.",
                R.drawable.w1,
                "Là chàng trai vui tính, sáng tạo, Hậu không chỉ là người đem đến những trò chơi vô cùng thú vị cho các sự kiện tại CLB mà còn là một người chu đáo trong công tác hậu cần."

            )
        )
        listWe.add(
            Daata(
                "Nguyễn Mạnh Tuân",
                "D19CQCN03-B",
                "Sở Thích: Xem anime, nghe nhạc, ngủ,...",
                "Châm Ngôn Yêu Thích: Để vươn tới thành công, ham muốn thành công của bạn phải cao hơn nỗi sợ về sự thất bại.",
                R.drawable.w2,
                "Tuy Tuân là một chàng trai lạnh lùng ít nói, nhưng không vì thế mà những trò chơi Tuân đưa ra thiếu sự hấp dẫn mà ngược lại luôn nhận được sự thích thú từ tất cả các thành viên trong CLB."

            )
        )
        listWe.add(
            Daata(
                "Lê Xuân Minh",
                "D19CQCN11-B",
                "Sở Thích: Thích ăn, cực thích ăn.",
                "Châm Ngôn Yêu Thích: Keep moving foward.",
                R.drawable.w3,
                "Là một người hòa đồng, nhiệt tình, hăng hái trong hoạt động cũng như trong các cuộc thi trong và ngoài CLB, Minh đã mang đến cho ban sự kiện những màu sắc mới."

            )
        )
        listWe.add(
            Daata(
                "Lê Thanh Bình",
                "D19CQCN07-B",
                "Sở Thích: Thể thao, đi khắp nơi, xem phim....",
                "Châm Ngôn Yêu Thích: The best thing about the future is that it comes one day at a time.",
                R.drawable.w4,
                "Là một chàng trai vui tính nhưng tỉ mỉ và đầy trách nhiệm, Bình là nam MC \"quen mặt\" trong các sự kiện tại CLB cũng như đóng góp rất nhiều ý tưởng và công sức cho ban sự kiện."

            )
        )
        listWe.add(
            Daata(
                "Nguyễn Thị Huyền Trang",
                "D19CQCN05-B",
                "Sở Thích: Game, nhạc, tấu hài, leve, ...",
                "Châm Ngôn Yêu Thích: Love myself.",
                R.drawable.w7,
                "Là cô gái vui vẻ, nữ tính và tràn đầy năng lượng, Trang là một trong những người dẫn dắt nhóm múa của CLB. Trong các sự kiện, Trang luôn là người đem đến niềm vui cho mọi người bằng giọng hát truyền cảm của mình."

            )
        )
        listWe.add(
            Daata(
                "Phạm Thị Thanh Hảo",
                "D19CQCN08-B",
                "Sở Thích: Không xác định.",
                "Châm Ngôn Yêu Thích: Try a little harder to be a little better.",
                R.drawable.w6,
                "Là cô gái nữ tính và tỉ mỉ, Hảo là một trong những người phụ trách công tác hậu cần cho các sự kiện của CLB. Với tài năng hội họa của mình, mong rằng Hảo cùng với Ban Sự Kiện sẽ thành công hơn nữa trong nhiệm kì tới."

            )
        )
        listWe.add(
            Daata(
                "Bùi Quang Dương",
                "D19CQAT03-B",
                "Sở Thích: Không xác định.",
                "Châm Ngôn Yêu Thích: Vấp ngã ở đâu đứng lên ở đó.",
                R.drawable.w5,
                "Là một chàng trai hiền lành, ấm áp, Dương luôn âm thầm đóng góp để cùng nhau phát triển CLB."

            )
        )
        listWe.add(
            Daata(
                "Đỗ Thị Thu Thảo",
                "D19CQAT02-B",
                "Sở Thích: Thích ăn và ngủ.",
                "Châm Ngôn Yêu Thích: Less is more.",
                R.drawable.w8,
                "Nhắc đến Thu Thảo là nhắc đến một cô gái xinh xắn và đáng yêu, luôn tạo cho mọi người xung quanh cảm giác thoải mái, vô tư. Thảo luôn để lại ấn tượng bởi sự tỉ mỉ, tâm huyết và có trách nhiệm với mọi nhiệm vụ của mình."

            )
        )

    }

    private fun adddtAi() {
        listAi.add(
            Daata(
                "Nguyễn Minh Phương",
                "D19CQAT01-B",
                "Sở Thích: Solo Yasuo, kiếm tiền, tiêu tiền.",
                "Châm Ngôn Yêu Thích: Nếu không chăm sóc được cây, thì đừng gieo hạt.",
                R.drawable.a1,
                "Là một chàng trai vui tính, nói ít làm nhiều, Minh Phương cứ luôn lặng lẽ, âm thầm cống hiến để xây dựng CLB từ những ngày đầu tiên."

            )
        )
        listAi.add(
            Daata(
                "Nguyễn Thị Uyên",
                "D19CQCN07-B",
                "Sở Thích:  Ngủ,...",
                "Châm Ngôn Yêu Thích: Cuộc sống không yêu cầu chúng ta đỉnh nhất, chỉ là chúng ta cố gắng hết sức.",
                R.drawable.a2,
                "Là cô gái xinh xắn với hai má lúm đồng tiền, Uyên luôn để lại ấn tượng bởi sự thông minh, có trách nhiệm trong mọi nhiệm vụ của mình và luôn biết cách giúp đỡ bạn bè. Tâm huyết, cẩn thận và cháy hết mình là những gì ProPTITers có thể miêu tả về cô gái này."

            )
        )
        listAi.add(
            Daata(
                "Nguyễn Duy Dũng",
                "D19CQCN04-B",
                "Sở Thích: Ăn, anime, manga, lofi hip hop music, jazz music, crush,...",
                "Châm Ngôn Yêu Thích: Nếu bạn muốn như bạn chưa từng có, bạn phải làm những việc bạn chưa bao giờ làm.",
                R.drawable.a3,
                "Là một chàng trai chu đáo, cầu toàn trong công việc, Duy Dũng đã giúp các bạn rất nhiều trong quá trình học tập, hăng hái trong mọi hoạt động của CLB là cách Dũng đã chinh phục lòng tin của các ProPTITers trong suốt thời gian qua."

            )
        )
    }

    private fun adddtMb() {
        listMb.add(
            Daata(
                "Hoàng Đức Minh",
                "D19CQCN08-B",
                "Sở Thích: Đọc sách, xem phim,...",
                "Châm Ngôn Yêu Thích: Lost time is never found again.",
                R.drawable.mb2,
                "Là một chàng trai cơ bắp, vui tính, luôn luôn lắng nghe, luôn luôn thấu hiểu và nỗ lực đổi mới sáng tạo để cùng phát triển là cách Đức Minh đã chinh phục lòng tin của các ProPTITers trong suốt thời gian qua."

            )
        )
        listMb.add(
            Daata(
                "Bùi Quang Trường",
                "B19CQCN10-B",
                "Sở Thích: Xem anime, nghe nhạc, chó, mèo, du lịch, game, đọc truyện.....",
                "Châm Ngôn Yêu Thích: Vận may và tình yêu dành cho người can đảm.",
                R.drawable.mb1,
                "Là một chàng trai điềm đạm, trong nóng ngoài lạnh, Trường luôn đưa ra những ý tưởng, đóng góp rất hữu ích để phát triển CLB."
            )
        )
        listMb.add(
            Daata(
                "Lê Hồng Dương",
                "B19CQCN-B",
                "Sở Thích: Xem review phim, đi chơi với bạn bè, nghe nhạc ballad.",
                "Châm Ngôn Yêu Thích: Khi bạn khao khát một điều gì đó, cả vũ trụ sẽ giúp bạn.",
                R.drawable.mb3,
                "Chàng trai được các ProPTITers ưu ái đặt biệt danh “Thầy Ba”, sáng tạo và có trách nhiệm là cách mà Hồng Dương luôn hoàn thành tốt nhiệm vụ của mình."
            )
        )
        listMb.add(
            Daata(
                "Kiều Đức Long",
                "B19CQCN05-B",
                "Sở Thích: Không có sở thích",
                "Châm Ngôn Yêu Thích: There is nothing permanent except change.",
                R.drawable.mb4,
                "Với phong cách làm việc sáng tạo, có trách nhiệm với mọi nhiệm vụ của mình, Đức Long đã mang tới cho ProPTIT những Media vô cùng độc đáo và chất lượng."
            )
        )
        listMb.add(
            Daata(
                "Đào Bích Diệp",
                "B19CQCN04-B",
                "Sở Thích: Ngủ,...",
                "Châm Ngôn Yêu Thích: Đừng nằm trên giường quá lâu, trừ khi bạn làm ra tiền khi ở trên đó.",
                R.drawable.mb5,
                "Là một cô gái với nụ cười rất tươi, Diệp luôn tạo cho mọi người xung quanh cảm giác thoải mái, dễ gần. Với phong cách làm việc cực kỳ có trách nhiệm và sáng tạo, tin rằng Diệp sẽ tự tin tỏa sáng hơn nữa trong thời gian tới."
            )
        )
        listMb.add(
            Daata(
                "Cồ Thị Phương Hoa",
                "B19CQCN11-B",
                "Sở Thích: Gõ bàn phím ker, thích xem Ted ED, thích nấu ăn, thích ăn, thích đi chơi với ny,....",
                "Châm Ngôn Yêu Thích: Áp lực tạo nên kim cương.",
                R.drawable.mb6,
                "Nếu như chàng trai văn võ song toàn đã gọi tên Đăng Dũng thì chắc hẳn không thể không kể đến cô gái văn võ song toàn- Phương Hoa. Không chỉ học tập tốt, Hoa còn rất năng động, hòa đồng với bạn bè, luôn hăng hái tham gia các hoạt động văn nghệ của CLB."
            )
        )
        listMb.add(
            Daata(
                "Trần Thị Hằng",
                "B19CQCN10-B",
                "Sở Thích: Không xác định.",
                "Châm Ngôn Yêu Thích: Không có ai hoàn hảo đó là lý do bút chì có cục gôm.",
                R.drawable.mb7,
                "Là cô bạn mang vẻ đẹp của một cô gái mạnh mẽ, vui tính và dễ gần. Ở Hằng luôn toát lên phong thái điềm tĩnh, rất có trách nhiệm với công việc."
            )
        )
        listMb.add(
            Daata(
                "Trần Đăng Dũng",
                "B19CQCN03-B",
                "Sở Thích: Nghe nhạc, đọc sách, vào VinMart, ...",
                "Châm Ngôn Yêu Thích: If you don’t walk today, you’ll have to run tomorrow.",
                R.drawable.mb8,
                "“Văn võ song toàn” chắc hẳn là câu nói đúng nhất khi nhắc đến tràng trai đa tài này. Nói về độ say mê, nhiệt huyết và làm việc cực kỳ năng suất Dũng đều hội tụ đủ cả."
            )
        )
        listMb.add(
            Daata(
                "Phạm Trung Huy",
                "D19CQCN05-B",
                "Sở Thích: Nghe nhạc rap, đá fifa , đi loanh quanh đâu đó chụp ảnh dạo,...",
                "Châm Ngôn Yêu Thích: Keep it real, keep it raw.",
                R.drawable.mb9,
                "Nhắc đến Huy là nhắc đến một Photographer chính hiệu. Những góc nhìn tinh tế của chàng trai này đã mang đến cho ProPTIT những bức ảnh tâm huyết nhất, chất lượng nhất."
            )
        )
        listMb.add(
            Daata(
                "Nguyễn Thị Quỳnh Trang",
                "B19CQCN10-B",
                "Sở Thích: sưu tập truyện ngắn kinh dị, truyện tranh,...",
                "Châm Ngôn Yêu Thích: Tôi chỉ biết một điều là: Tôi chẳng biết gì cả.",
                R.drawable.mb10,
                "Là một cô gái dịu dàng, tinh tế, Quỳnh Trang luôn biết cách quan tâm đến các thành viên khác trong CLB. Với phong cách làm việc rất có trách nhiệm và sáng tạo, Trang luôn hoàn thành tốt mọi nhiệm vụ của mình."
            )
        )
    }
}


