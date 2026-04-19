package com.pichillilorenzo.flutter_inappwebview_android.credential_database;

import android.content.Context;
import android.webkit.WebViewDatabase;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLCredential;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLProtectionSpace;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import sc.i;
import sc.j;

/* JADX INFO: loaded from: classes2.dex */
public class CredentialDatabaseHandler extends ChannelDelegateImpl {
    protected static final String LOG_TAG = "CredentialDatabaseHandler";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_credential_database";
    public static CredentialDatabase credentialDatabase;
    public InAppWebViewFlutterPlugin plugin;

    public CredentialDatabaseHandler(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(new j(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
        this.plugin = inAppWebViewFlutterPlugin;
    }

    public static void init(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        if (credentialDatabase == null) {
            credentialDatabase = CredentialDatabase.getInstance(inAppWebViewFlutterPlugin.applicationContext);
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.plugin = null;
        credentialDatabase = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r14v12, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r14v16, types: [java.util.ArrayList, java.util.List] */
    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, sc.j.c
    public void onMethodCall(i iVar, j.d dVar) {
        Context context;
        Object arrayList;
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin != null) {
            init(inAppWebViewFlutterPlugin);
        }
        String str = iVar.f20503a;
        str.hashCode();
        switch (str) {
            case "clearAllAuthCredentials":
                CredentialDatabase credentialDatabase2 = credentialDatabase;
                if (credentialDatabase2 != null) {
                    credentialDatabase2.clearAllAuthCredentials();
                    InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin2 = this.plugin;
                    if (inAppWebViewFlutterPlugin2 != null && (context = inAppWebViewFlutterPlugin2.applicationContext) != null) {
                        WebViewDatabase.getInstance(context).clearHttpAuthUsernamePassword();
                    }
                    arrayList = Boolean.TRUE;
                    dVar.success(arrayList);
                    break;
                }
                arrayList = Boolean.FALSE;
                dVar.success(arrayList);
                break;
            case "getHttpAuthCredentials":
                ArrayList arrayList2 = new ArrayList();
                if (credentialDatabase != null) {
                    Iterator<URLCredential> it = credentialDatabase.getHttpAuthCredentials((String) iVar.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST), (String) iVar.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL), (String) iVar.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM), (Integer) iVar.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT)).iterator();
                    while (it.hasNext()) {
                        arrayList2.add(it.next().toMap());
                    }
                }
                dVar.success(arrayList2);
                break;
            case "removeHttpAuthCredential":
                if (credentialDatabase != null) {
                    credentialDatabase.removeHttpAuthCredential((String) iVar.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST), (String) iVar.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL), (String) iVar.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM), (Integer) iVar.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT), (String) iVar.a(URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME), (String) iVar.a(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD));
                    arrayList = Boolean.TRUE;
                    dVar.success(arrayList);
                    break;
                }
                arrayList = Boolean.FALSE;
                dVar.success(arrayList);
                break;
            case "setHttpAuthCredential":
                if (credentialDatabase != null) {
                    credentialDatabase.setHttpAuthCredential((String) iVar.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST), (String) iVar.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL), (String) iVar.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM), (Integer) iVar.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT), (String) iVar.a(URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME), (String) iVar.a(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD));
                    arrayList = Boolean.TRUE;
                    dVar.success(arrayList);
                    break;
                }
                arrayList = Boolean.FALSE;
                dVar.success(arrayList);
                break;
            case "removeHttpAuthCredentials":
                if (credentialDatabase != null) {
                    credentialDatabase.removeHttpAuthCredentials((String) iVar.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST), (String) iVar.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL), (String) iVar.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM), (Integer) iVar.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT));
                    arrayList = Boolean.TRUE;
                    dVar.success(arrayList);
                    break;
                }
                arrayList = Boolean.FALSE;
                dVar.success(arrayList);
                break;
            case "getAllAuthCredentials":
                arrayList = new ArrayList();
                CredentialDatabase credentialDatabase3 = credentialDatabase;
                if (credentialDatabase3 != null) {
                    for (URLProtectionSpace uRLProtectionSpace : credentialDatabase3.protectionSpaceDao.getAll()) {
                        ArrayList arrayList3 = new ArrayList();
                        Iterator<URLCredential> it2 = credentialDatabase.credentialDao.getAllByProtectionSpaceId(uRLProtectionSpace.getId()).iterator();
                        while (it2.hasNext()) {
                            arrayList3.add(it2.next().toMap());
                        }
                        HashMap map = new HashMap();
                        map.put("protectionSpace", uRLProtectionSpace.toMap());
                        map.put("credentials", arrayList3);
                        arrayList.add(map);
                    }
                }
                dVar.success(arrayList);
                break;
            default:
                dVar.notImplemented();
                break;
        }
    }
}
