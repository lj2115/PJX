package com.newtouch.pjx.utils;

public class BaiduUtil {
//	Context mContext;
//	LocationClient mLocClient;
//	public MyLocationListenner myListener  = new MyLocationListenner();
//	boolean isFirstLoc = true;// �Ƿ��״ζ�λ
//
//	public BaiduUtil(Context context) {
//		this.mContext = context;
//		System.out.println("------------------>baiduContext<----------------------");
//	}
//
//	public void start(){
//		System.out.println("------------------>start<----------------------");
//		mLocClient = new LocationClient(mContext);
//		mLocClient.registerLocationListener(myListener);
//		LocationClientOption option = new LocationClientOption();
//		option.setOpenGps(true);// ��gps
//		option.setCoorType("bd09ll"); // ������������
//		option.setScanSpan(1000);
//		option.setIsNeedAddress(true);
//		mLocClient.setLocOption(option);
//		mLocClient.start();
//	}
//
//	public void stop(){
//		System.out.println("------------------>stop<----------------------");
//		mLocClient.stop();
//	}
//
//	public class MyLocationListenner implements BDLocationListener {
//
//		@Override
//		public void onReceiveLocation(BDLocation location) {
//			System.out.println("��λ�Ļص�����");
//			// map ���ٺ��ڴ����½��յ�λ��
//			if (location == null) return;
//			if (isFirstLoc) {
//				isFirstLoc = false;
//				/*System.out.println("����" + location.getLatitude());
//				System.out.println("γ��" + location.getLongitude());
//				System.out.println("Addrstr" + location.getAddrStr() + " altitude" + location.getAltitude() +
//						" citycode" + location.getCityCode() + " direction" + location.getDirection() + " province" + location.getProvince()+
//						            "  street" + location.getStreet() + "��time" + location.getTime()+
//						           " bulidId"+ location.getBuildingID() + " address" + location.getAddress() +
//						           " country" + location.getCountry() + " direction" + location.getDirection() +
//						           "city" + location.getCity());*/
//			 String addrStr = location.getAddrStr();
//			 String headStr = location.getCountry() + location.getProvince() + location.getCity();
//			 String posTitle = addrStr.replace(headStr, "");
//			 String posAddress = location.getStreet();
//			 String posX =  String.valueOf(location.getLongitude());
//			 System.out.println("posXFirst: " + posX);
//			 String posY = String.valueOf(location.getLatitude());
//			 System.out.println("posYFirst:" + posY);
//
//			 Config.cachePOI(mContext, posTitle, posAddress, posX, posY);
//			 Map<String, String> poiMap = Config.getCachePOI(mContext);
//				new NetLocate(Config.getCachedToken(mContext), poiMap.get(Config.KEY_POSTITLE),
//						poiMap.get(Config.KEY_POSADDRESS), poiMap.get(Config.KEY_POSX), poiMap.get(Config.KEY_POSY), new NetLocate.SuccessCallback() {
//							@Override
//							public void onSuccess() {
//								mContext.startActivity(new Intent(mContext, MainActivity.class));
//								((Activity) mContext).finish();
//							}
//						}, new NetLocate.FailCallback() {
//							@Override
//							public void onFail() {
//								System.out.println("�ϴ������ַ��������ʧ��");
//							}
//						});
//			}
//		}
//	}
}
