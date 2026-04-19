package bb;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.util.Log;
import com.amazon.a.a.o.b.f;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import sc.c;
import sc.j;
import sc.l;

/* JADX INFO: loaded from: classes2.dex */
public class b implements l {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f5658j = (c.class.hashCode() + 43) & 65535;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f5659k = (c.class.hashCode() + 83) & 65535;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f5660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private j.d f5661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f5662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f5663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f5664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f5665f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String[] f5666g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private c.b f5667h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private byte[] f5668i;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Intent f5669a;

        a(Intent intent) {
            this.f5669a = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            b bVar;
            String str;
            Uri uri;
            bb.a aVarM;
            if (this.f5669a != null) {
                ArrayList arrayList = new ArrayList();
                int i10 = 0;
                if (this.f5669a.getClipData() != null) {
                    int itemCount = this.f5669a.getClipData().getItemCount();
                    while (i10 < itemCount) {
                        Uri uri2 = this.f5669a.getClipData().getItemAt(i10).getUri();
                        if (Objects.equals(b.this.f5664e, "image/*") && b.this.f5665f > 0) {
                            uri2 = d.b(uri2, b.this.f5665f, b.this.f5660a.getApplicationContext());
                        }
                        bb.a aVarM2 = d.m(b.this.f5660a, uri2, b.this.f5663d);
                        if (aVarM2 != null) {
                            arrayList.add(aVarM2);
                            Log.d("FilePickerDelegate", "[MultiFilePick] File #" + i10 + " - URI: " + uri2.getPath());
                        }
                        i10++;
                    }
                } else if (this.f5669a.getData() != null) {
                    Uri data = this.f5669a.getData();
                    if (Objects.equals(b.this.f5664e, "image/*") && b.this.f5665f > 0) {
                        data = d.b(data, b.this.f5665f, b.this.f5660a.getApplicationContext());
                    }
                    if (b.this.f5664e.equals("dir")) {
                        Uri uriBuildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(data, DocumentsContract.getTreeDocumentId(data));
                        Log.d("FilePickerDelegate", "[SingleFilePick] File URI:" + uriBuildDocumentUriUsingTree.toString());
                        String strG = d.g(uriBuildDocumentUriUsingTree, b.this.f5660a);
                        if (strG != null) {
                            b.this.m(strG);
                            return;
                        } else {
                            b.this.l("unknown_path", "Failed to retrieve directory path.");
                            return;
                        }
                    }
                    bb.a aVarM3 = d.m(b.this.f5660a, data, b.this.f5663d);
                    if (aVarM3 != null) {
                        arrayList.add(aVarM3);
                    }
                    if (arrayList.isEmpty()) {
                        bVar = b.this;
                        str = "Failed to retrieve path.";
                        bVar.l("unknown_path", str);
                        return;
                    }
                    Log.d("FilePickerDelegate", "File path:" + arrayList.toString());
                } else if (this.f5669a.getExtras() != null) {
                    Bundle extras = this.f5669a.getExtras();
                    if (!extras.keySet().contains("selectedItems")) {
                        bVar = b.this;
                        str = "Failed to retrieve path from bundle.";
                        bVar.l("unknown_path", str);
                        return;
                    }
                    ArrayList<Parcelable> arrayListN = b.this.n(extras);
                    if (arrayListN != null) {
                        for (Parcelable parcelable : arrayListN) {
                            if ((parcelable instanceof Uri) && (aVarM = d.m(b.this.f5660a, (uri = (Uri) parcelable), b.this.f5663d)) != null) {
                                arrayList.add(aVarM);
                                Log.d("FilePickerDelegate", "[MultiFilePick] File #" + i10 + " - URI: " + uri.getPath());
                            }
                            i10++;
                        }
                    }
                }
                b.this.m(arrayList);
                return;
            }
            b.this.l("unknown_activity", "Unknown activity error, please fill an issue.");
        }
    }

    /* JADX INFO: renamed from: bb.b$b, reason: collision with other inner class name */
    class HandlerC0133b extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f5671a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        HandlerC0133b(Looper looper, boolean z10) {
            super(looper);
            this.f5671a = z10;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            b.this.f5667h.success(Boolean.valueOf(this.f5671a));
        }
    }

    public b(Activity activity) {
        this(activity, null);
    }

    b(Activity activity, j.d dVar) {
        this.f5662c = false;
        this.f5663d = false;
        this.f5665f = 20;
        this.f5660a = activity;
        this.f5661b = dVar;
    }

    private void i() {
        this.f5661b = null;
    }

    private void j(boolean z10) {
        if (this.f5667h == null || this.f5664e.equals("dir")) {
            return;
        }
        new HandlerC0133b(Looper.getMainLooper(), z10).obtainMessage().sendToTarget();
    }

    private static void k(j.d dVar) {
        dVar.error("already_active", "File picker is already active", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(String str, String str2) {
        if (this.f5661b == null) {
            return;
        }
        j(false);
        this.f5661b.error(str, str2, null);
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(Object obj) {
        j(false);
        if (this.f5661b != null) {
            if (obj != null && !(obj instanceof String)) {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayList) obj).iterator();
                while (it.hasNext()) {
                    arrayList.add(((bb.a) it.next()).a());
                }
                obj = arrayList;
            }
            this.f5661b.success(obj);
            i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<Parcelable> n(Bundle bundle) {
        return Build.VERSION.SDK_INT >= 33 ? bundle.getParcelableArrayList("selectedItems", Parcelable.class) : bundle.getParcelableArrayList("selectedItems");
    }

    private boolean q(j.d dVar) {
        if (this.f5661b != null) {
            return false;
        }
        this.f5661b = dVar;
        return true;
    }

    private void r() {
        Intent intent;
        String str = this.f5664e;
        if (str == null) {
            return;
        }
        if (str.equals("dir")) {
            intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
        } else {
            if (this.f5664e.equals("image/*")) {
                intent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            } else {
                intent = new Intent("android.intent.action.GET_CONTENT");
                intent.addCategory("android.intent.category.OPENABLE");
            }
            Uri uri = Uri.parse(Environment.getExternalStorageDirectory().getPath() + File.separator);
            Log.d("FilePickerDelegate", "Selected type " + this.f5664e);
            intent.setDataAndType(uri, this.f5664e);
            intent.setType(this.f5664e);
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", this.f5662c);
            intent.putExtra("multi-pick", this.f5662c);
            if (this.f5664e.contains(f.f7478a)) {
                this.f5666g = this.f5664e.split(f.f7478a);
            }
            String[] strArr = this.f5666g;
            if (strArr != null) {
                intent.putExtra("android.intent.extra.MIME_TYPES", strArr);
            }
        }
        if (intent.resolveActivity(this.f5660a.getPackageManager()) != null) {
            this.f5660a.startActivityForResult(intent, f5658j);
        } else {
            Log.e("FilePickerDelegate", "Can't find a valid activity to handle the request. Make sure you've a file explorer installed.");
            l("invalid_format_type", "Can't handle the provided file type.");
        }
    }

    public void o(String str, String str2, String str3, String[] strArr, byte[] bArr, j.d dVar) {
        if (!q(dVar)) {
            k(dVar);
            return;
        }
        Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
        intent.addCategory("android.intent.category.OPENABLE");
        if (str != null && !str.isEmpty()) {
            intent.putExtra("android.intent.extra.TITLE", str);
        }
        this.f5668i = bArr;
        if (str2 == null || "dir".equals(str2) || str2.split(f.f7478a).length != 1) {
            intent.setType("*/*");
        } else {
            intent.setType(str2);
        }
        if (str3 != null && !str3.isEmpty() && Build.VERSION.SDK_INT >= 26) {
            intent.putExtra("android.provider.extra.INITIAL_URI", Uri.parse(str3));
        }
        if (strArr != null && strArr.length > 0) {
            intent.putExtra("android.intent.extra.MIME_TYPES", strArr);
        }
        if (intent.resolveActivity(this.f5660a.getPackageManager()) != null) {
            this.f5660a.startActivityForResult(intent, f5659k);
        } else {
            Log.e("FilePickerDelegate", "Can't find a valid activity to handle the request. Make sure you've a file explorer installed.");
            l("invalid_format_type", "Can't handle the provided file type.");
        }
    }

    @Override // sc.l
    public boolean onActivityResult(int i10, int i11, Intent intent) {
        if (i10 != f5659k) {
            if (this.f5664e == null) {
                return false;
            }
            int i12 = f5658j;
            if (i10 == i12 && i11 == -1) {
                j(true);
                new Thread(new a(intent)).start();
                return true;
            }
            if (i10 == i12 && i11 == 0) {
                Log.i("FilePickerDelegate", "User cancelled the picker request");
                m(null);
                return true;
            }
            if (i10 == i12) {
                l("unknown_activity", "Unknown activity error, please fill an issue.");
            }
            return false;
        }
        if (i11 == -1) {
            if (intent == null) {
                return false;
            }
            j(true);
            Uri data = intent.getData();
            if (data != null) {
                String str = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath() + File.separator + d.f(data, this.f5660a);
                try {
                    OutputStream outputStreamOpenOutputStream = this.f5660a.getContentResolver().openOutputStream(data);
                    if (outputStreamOpenOutputStream != null) {
                        outputStreamOpenOutputStream.write(this.f5668i);
                        outputStreamOpenOutputStream.flush();
                        outputStreamOpenOutputStream.close();
                    }
                    m(str);
                    return true;
                } catch (IOException e10) {
                    Log.i("FilePickerDelegate", "Error while saving file", e10);
                    l("Error while saving file", e10.getMessage());
                }
            }
        }
        if (i11 == 0) {
            Log.i("FilePickerDelegate", "User cancelled the save request");
            m(null);
        }
        return false;
    }

    public void p(c.b bVar) {
        this.f5667h = bVar;
    }

    public void s(String str, boolean z10, boolean z11, String[] strArr, int i10, j.d dVar) {
        if (!q(dVar)) {
            k(dVar);
            return;
        }
        this.f5664e = str;
        this.f5662c = z10;
        this.f5663d = z11;
        this.f5666g = strArr;
        this.f5665f = i10;
        r();
    }
}
