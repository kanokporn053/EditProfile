package app.example.kanokporn;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class dbcontroler_109 extends SQLiteOpenHelper{
	String Name,Sex, Birthday, Age,Major, Facebook, Line, Email;
	private static final String DATABASE_NAME = "db109";
	private static final String TABLE_REGISTER ="register";
	private static final int DATABASE_VERSION = 1;

	public dbcontroler_109(Context context) {
		super(context, TABLE_REGISTER, null,DATABASE_VERSION);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL("CREATE TABLE    "+ TABLE_REGISTER
				+"(RegiterID INTEGER PRIMARY KEY AUTOINCREMENT,"
				+"Name TEXT(100),"
				+"Sex TEXT(100)," 
				+"Birthday TEXT(100),"
				+"Age TEXT(100),"
				+"Major TEXT(100),"
				+"Facebook TEXT(100),"
				+"Line TEXT (100),"
				+"Email TEXT (100));");
		
		Log.d("CREATE TABLE", "Create Successfully");
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		db.execSQL("DROP TABLE IF EXISTS  "+TABLE_REGISTER );
		onCreate(db);
	}

	public long insertData(String Name,String Sex,String Birthday
			,String Age,String Major,String Facebook,String Line,String Email){
		try {
			SQLiteDatabase db;
			db=this.getWritableDatabase();
			ContentValues s = new ContentValues();
			s.put("Name", Name);
			s.put("Sex",Sex);
			s.put("Birthday", Birthday);
			s.put("Age", Age);
			s.put("Major", Major);
			s.put("Facebook",Facebook);
			s.put("Line",Line);
			s.put("Email",Email);
			
			long k = db.insert(TABLE_REGISTER, null,s);
			db.close();
			return k ;
			
		} catch (Exception e) {
			// TODO: handle exception
			return -1 ;
		}
		
	}
	
}
