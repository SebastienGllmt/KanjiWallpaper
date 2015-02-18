import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Main extends JFrame {
	
	public static final int WIDTH = 1920;
	public static final int HEIGHT = 1080;
	
	public static String kanji = "永況挑守覧塀遊疎孤材惨硝齢利考傷暑悼氏漂築剥探端回凍帳杉起飢斎肘膨税浜機類了猶耳週視宇提囚御乳撲屈蛇骨秒訓渉薪濁運中異倉届甚悔汚路昼晴銅損防闘万拶肉衷遷寮採苦敢戚好寛夢顧罪惧躍棟滅極仁暖交床天断悪揮陶猟台工陽当就漫禅夏在統秀貝高跳贈我官方濯愁招察詰貌坑篤亭脅初冬宴虫肝電束轄吟各報冒斜抽佳壇内粧削止奈侶畝押略丹千旋尊殴舌墓糖眉九唾績剣薄鍛堤褒噴左朝鼓話悦養危添標層妄晶衛側蔑落犠呉興薬今旺寒盛昔包徹虐現腫豆夕録働松尽凡行祝間向淑艶譲絶亀重外位字羊鋭妊卸婚忍径塑越言缶凸確己惰顕発那碑波陛姫練協祖昨融艦梅貿空響科拳適絡般紀旅想得腕恵儒料民暴瘍拒抵宝震持驚辣令渦介療奉銃聴呼郵説師困明痕似客猫浅脈伺造麺鳴祭虜術朴吉痛送曇詞籍市験占癒旦昧店業弁菓駄悟先倫謄伯計託動学邦香稿眠舗恒棚仮点珠弓節奇多女文委憲程逝抗怠姉否調衡援和捉羅王岐窮惑者労股荒祉勤哨通慕粋幸培勅玩是悠結等件新愛資犬士唐垂振感望雪甲喩姿一蜜脊病横筒匁氾酢装長璃頂銀肢版穀林吸督有怨聞酪桃錘柵鋼殉答柱瞬附減居木粘滑知瞭反急蒙笛担沈茎嫁徳征岸却険技瓶瑠走彼勢均完諾救平顔布眼拓買諭桑焦争俳喫漏艇芋岩批名恣賞寿勇共殻虚謹后周次入炭抑縛庫白貫飲血早軽蜂鯨脂餌昭第慣推苛閉霧吐湿検狂妙媒偉恩薦措与臭参渋燃幽藍線揺強侯模循濫承陸議時問看格枯恭歴阻麗棒改籠丙索奮混河以流幹頃婿陰羞南寺比算訴威過綻憚暦息海跡頭源博雌康某軒梗三牧認嘱歓処帥隙諮鼻爪紅射酎壌手表暫掛貼免信繰需促概味曹盗妻羨兵芳屋頬紙冶蒸践狩仲肥井鎮臨劣厚階挙灰党桜冗関笑門漸謝昆摯容崖皇崩拷犯句軌達潟踪壊豚半紋須巨旬称桁鬱款苗窓慎折誕排注医幾旗執匿婦幕泳脳遠堕限爆待刺針織肖壁光胃破会曜吹底航頻撃仕窃庭傑集固奴縦較低年裁宣覚括庶靴嫡網賢魂景鋳撤対傾約熟絹僚妖膳吏離宛憂語述農菜拙乞斥署衣渓窟害塔革凹槽紫忙降痩選撮盲羽乗摂迭余麦畔貪詳価懲儀塩瞳湯奪律穂力柄酬器旨戦沃冊相礼遇且沸寂罵乙四慢準指詠湖駒寸子維覇縁賀戻泥属創往駅授耐塊星絵色引両眺怪服未憤叫巧如謎営安伸願磨仏隊設敗弄悩亜牛辞頼芝世肪逓右峡変楽延俵英貸応構希辱惜除殿足二隷精谷錠肩錬西役緻遣堂域家丁期鳥別日倍塚鉛即町消弦及秋飛途職紡宮口抱串純渇諧派翁繊分式恐弥硬写事滞爽碁補因迅韻堅涯張唄員輝擁随故媛逆避醸章干副収使典闇刷試舎易敷露政歯憬像富満舟囲緊省災情俸庁麻蛮烈洋司院訂架汁粉普毎竜静琴山俺偏染液解親叙晩踊付作含違畑著没団石死糧矢虞泊接胸喪油秘鈍権復移組誤規陥舷給更握傍紺憶双愚良帰売凶裏導込数微砂健武冥膝坂穏沖聖脚灯久斉鏡熱度准咲衰洞増爵机至配切扇累盾荷皿打拐捗辺忘膚酔輪叱板隆東素棋潜圏堪胞銑訳憎脱忠藻雇尺特習搭嫉覆鑑嬢膜夜醒値季領滋誌賄聘卑頑弔衝雰競砕直廷村若釣遍診観輸討縫賓尉僅泡肺合裕枠斤亡汰崎車乾金筆透霊鉱備短勘置順俗箱騰偵玄六清野剤際臣企葉傲肌雷伴成彫菌胴慈裸朕呪凝総腰請奔募逐状番軍難溶骸埋志揚韓詩超監閲納堀橋専朽襲餓月釈扱美芯戒見妹梨挫主穫整映賦陪締音鍋古弾欠袖伏巾罷誰登麓磁影善蓋花疑傘場朗由根住伎果飼思識稲秩友嘆斗涼倒座汎魚票割腺乏続勲樹無黄佐効館塗候自百恨阜貨呂稽藩飾島論捕辛土栽厄軟紹小夫歌岬壱獣侮還采緯項読放公去食費遺巣挿草質港伐弊喉帝開舶摩範判腎隔慮拾軸淫翻例賃貯地下津互曾礎飽拉叔戴刊駆本巡芽栓始列慰封郎誉黒閑唱睡戸玉鎌拠具掲申億弱氷椅級尚疫宜鮮目昇積単忌意盟拝財郭耗薫編差童酷筋怒替宅謡実倣滴怖漠予休敬要独首裂的警暇七老他返邸区搬里依任速界緒室製雑弧形債栄徴殖品塁腐勃枝蚕炉迎枢髪泌凄毛物把購匠査欺刑族法宿為船械真憧衆尻糸神商預照奥記捜陵帯縮談快済錦豪摘譜尿誘八擦璽全袋峰騒葛履突窒浮腸徒札雄貞藤枕態憩泣着複剛嗅育務社不岡欲功管扶娠耕呈郷声面活仙停嘲廉赴滝沢堆鹿仰審嫌喜転租隠裾系種携壮厳投矛伝赤獲浴様暗煮鶴沿醜腹泰隅然個濃赦君肯非身掌煩才恥錯牙責群誓示劾柳酒殊鎖絞喚擬鉢岳額痘咽勝曲義盤存県操択終匂歳春諜蔵決拍圧払猛汽城供上娘暮抜継許蹴廊潮課雅症慶誠賊鶏漁象鐘孔十繕侵箸代荘澄掘畜炊局娯基進瓦剖所斬誇描敏浄疾測繭華残坪原繁酌並量禍符坊謙販校瀬尾墾国勺尋密護矯礁但僧頒塞太零寧喝研抹案遅粒郊保貧尼献該借優漢閥牲剰臆班嵐五懇髄俊少策泉妃竹載溺既臓稚鉄川虎株踏侍併綿寝努換欄峠制激幼厘粗潔詮菊充庸克孫席旧葬従率便教道必硫展遭帆朱幻号性片再丸失化祈偶負訃享謀哀甘取敵洗丼痢馬盆妨江熊餅加曖唇挟頓環近偽輩州歩貢疲洪罰攻騎末雲証潰退鍵墨粛郡講棄劇母隣逃蔽序猿益楼縄萎彩箇貴寡連扉正将京控埼到房府求汗弟捨駐搾兆訟産漬遂遮姻毒湧銘宵書経用角命召挨掃欧淡施致隻渡留匹距田蚊幣据広浸婆璧人賛訪飯沙条簿懸茶妥触禁棺鬼褐哲涙男魔嚇獄慌最詣都珍画浦捻幅来卒能償患風央細畳則披核可大水巻奨火被冷戯唆卓塾虹父彰深銭翼心舞拘狭穴私園魅蛍励障究球邪鈴治沼湾柔倹冠助念抄栃刻漆賠緩慨諦癖霜史街又孝北前米詐図襟閣脹受蓄丈煎窯刈印暁係告立植狙燥勉兄評陳拭体遵温理弐胆兼池枚段稼境散畏何填森浪垣炎煙畿宙福支糾帽賜桟嗣皮円刀斑迷生丘寄気殺演謁宗妬陣析臼乱杯緑姓綱茨契常潤憾廃出背墜屯墳顎悲遜酸焼祥崇後懐催型勧修宰卵溝題皆彙部僕建阪迫趣奏刃元唯胎愉諸啓痴雨紛簡黙定升徐逸同逮青砲茂脇酵詔午慄翌券豊箋芸追恋紳児拡";
	
	public static String getRandomString() {
		List<Character> shuffled = new ArrayList<>();
		for (char c : kanji.toCharArray()) {
			shuffled.add(c);
		}
		Collections.shuffle(shuffled);
		StringBuffer kanjiBuffer = new StringBuffer(kanji.length());
		for (Character c : shuffled) {
			kanjiBuffer.append(c);
		}
		
		return kanjiBuffer.toString();
	}
	
	public static void main(String[] args) {
		drawPicture(getRandomString());
	}
	
	public static void drawPicture(String shuffledKanji) {
		BufferedImage img = new BufferedImage(Main.WIDTH, Main.HEIGHT, BufferedImage.TYPE_INT_RGB);
		Graphics2D g2 = (Graphics2D) img.getGraphics();
		g2.setColor(Color.BLACK);
		g2.fillRect(0, 0, Main.WIDTH, Main.HEIGHT);
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		final int BASE_FONT_SIZE = 20;
		final String FONT_NAME = "Meiryo";
		Font font = new Font(FONT_NAME, Font.PLAIN, BASE_FONT_SIZE);
		g2.setFont(font);
		
		int kanjiIndex = 0;
		float light = (float) Math.random();
		for (int x = 0; x < Main.WIDTH; x += BASE_FONT_SIZE) {
			for (int y = 0; y < Main.HEIGHT; y += BASE_FONT_SIZE) {
				light = getLight(light);
				g2.setColor(Color.getHSBColor(0.25f, 0.3f, light));
				g2.drawString(shuffledKanji.substring(kanjiIndex, kanjiIndex + 1), x, y);
				kanjiIndex++;
				
				// loop back around to the first kanji if we've gone through them all already
				if (kanjiIndex >= shuffledKanji.length()) {
					kanjiIndex = 0;
				}
			}
		}
		try {
			String BASE_NAME = "output";
			int versionNumber = 0;
			File outputFile;
			do {
				outputFile = new File(BASE_NAME + versionNumber + ".png");
				versionNumber++;
			} while (outputFile.exists());
			ImageIO.write(img, "png", outputFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static float getLight(float prevLight) {
		if (Math.random() < 0.1) {
			return (float) (Math.random() / 10 + 0.05f);
		} else {
			if (prevLight > 0.9) {
				return (float) (Math.random() / 10 + 0.05f);
			} else {
				return prevLight + 0.02f;
			}
		}
	}
}
