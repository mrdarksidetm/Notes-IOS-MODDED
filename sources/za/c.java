package za;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzsg;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import wa.i;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Executor f24305b = wa.e.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f24306a;

    private c(Context context) {
        this.f24306a = context;
    }

    public static c c(Context context) {
        return new c(context);
    }

    private static void e(String str, Exception exc) {
        if (Log.isLoggable("ResultHelper", 6)) {
            Log.e("ResultHelper", str, exc);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0089 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final android.net.Uri a(android.net.Uri r8, java.lang.String r9) {
        /*
            r7 = this;
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = r8.getScheme()
            if (r1 != 0) goto Lb
            return r0
        Lb:
            android.content.Context r2 = r7.f24306a
            java.io.File r3 = new java.io.File
            java.io.File r2 = r2.getCacheDir()
            java.lang.String r4 = "mlkit_docscan_ui_client"
            r3.<init>(r2, r4)
            boolean r2 = r3.exists()
            if (r2 != 0) goto L21
            r3.mkdir()
        L21:
            java.io.File r2 = new java.io.File
            long r4 = android.os.SystemClock.elapsedRealtimeNanos()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r6.append(r9)
            java.lang.String r9 = r6.toString()
            r2.<init>(r3, r9)
            android.content.Context r9 = r7.f24306a     // Catch: java.io.IOException -> L92
            java.lang.String r3 = r9.getPackageName()     // Catch: java.io.IOException -> L92
            java.lang.String r4 = "com.google.android.gms"
            boolean r3 = java.util.Objects.equals(r3, r4)     // Catch: java.io.IOException -> L92
            if (r3 != 0) goto L53
            java.lang.String r3 = "content"
            boolean r1 = r1.equals(r3)     // Catch: java.io.IOException -> L92
            if (r1 != 0) goto L50
            goto L53
        L50:
            com.google.android.gms.internal.mlkit_vision_document_scanner.zzk r1 = com.google.android.gms.internal.mlkit_vision_document_scanner.zzk.zza     // Catch: java.io.IOException -> L92
            goto L55
        L53:
            com.google.android.gms.internal.mlkit_vision_document_scanner.zzk r1 = com.google.android.gms.internal.mlkit_vision_document_scanner.zzk.zzc     // Catch: java.io.IOException -> L92
        L55:
            java.io.InputStream r9 = com.google.android.gms.internal.mlkit_vision_document_scanner.zzl.zza(r9, r8, r1)     // Catch: java.io.IOException -> L92
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L86
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L86
            r3 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L7c
        L62:
            int r4 = r9.read(r3)     // Catch: java.lang.Throwable -> L7c
            r5 = -1
            if (r4 == r5) goto L6e
            r5 = 0
            r1.write(r3, r5, r4)     // Catch: java.lang.Throwable -> L7c
            goto L62
        L6e:
            r1.flush()     // Catch: java.lang.Throwable -> L7c
            android.net.Uri r2 = android.net.Uri.fromFile(r2)     // Catch: java.lang.Throwable -> L7c
            r1.close()     // Catch: java.lang.Throwable -> L86
            r9.close()     // Catch: java.io.IOException -> L92
            return r2
        L7c:
            r2 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L81
            goto L85
        L81:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch: java.lang.Throwable -> L86
        L85:
            throw r2     // Catch: java.lang.Throwable -> L86
        L86:
            r1 = move-exception
            if (r9 == 0) goto L91
            r9.close()     // Catch: java.lang.Throwable -> L8d
            goto L91
        L8d:
            r9 = move-exception
            r1.addSuppressed(r9)     // Catch: java.io.IOException -> L92
        L91:
            throw r1     // Catch: java.io.IOException -> L92
        L92:
            r9 = move-exception
            java.lang.String r8 = r8.toString()
            java.lang.String r1 = "Failed to save file to local: "
            java.lang.String r8 = r1.concat(r8)
            e(r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: za.c.a(android.net.Uri, java.lang.String):android.net.Uri");
    }

    final Task b(final int i10, final Intent intent) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        f24305b.execute(new Runnable() { // from class: za.b
            /* JADX WARN: Removed duplicated region for block: B:17:0x004e A[Catch: all -> 0x005d, TryCatch #0 {all -> 0x005d, blocks: (B:6:0x000f, B:8:0x002b, B:10:0x0031, B:12:0x0037, B:15:0x0046, B:17:0x004e, B:21:0x0058, B:27:0x0063, B:28:0x006e), top: B:36:0x000f }] */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0058 A[Catch: all -> 0x005d, PHI: r4
  0x0058: PHI (r4v3 android.net.Uri) = (r4v7 android.net.Uri), (r4v5 android.net.Uri) binds: [B:16:0x004c, B:20:0x0057] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x005d, blocks: (B:6:0x000f, B:8:0x002b, B:10:0x0031, B:12:0x0037, B:15:0x0046, B:17:0x004e, B:21:0x0058, B:27:0x0063, B:28:0x006e), top: B:36:0x000f }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    r12 = this;
                    int r0 = r2
                    za.c r1 = r12.f24301a
                    android.content.Intent r2 = r3
                    java.lang.String r3 = "string_extra_session_id"
                    r4 = 0
                    r5 = -1
                    if (r0 != r5) goto L5f
                    if (r2 != 0) goto Lf
                    goto L5f
                Lf:
                    java.lang.String r0 = "uri_array_extra_result_image_uris"
                    java.util.ArrayList r0 = r2.getParcelableArrayListExtra(r0)     // Catch: java.lang.Throwable -> L5d
                    java.lang.String r5 = "uri_extra_result_pdf_uri"
                    android.os.Parcelable r5 = r2.getParcelableExtra(r5)     // Catch: java.lang.Throwable -> L5d
                    android.net.Uri r5 = (android.net.Uri) r5     // Catch: java.lang.Throwable -> L5d
                    java.lang.String r6 = "int_extra_result_page_count"
                    r7 = 0
                    int r6 = r2.getIntExtra(r6, r7)     // Catch: java.lang.Throwable -> L5d
                    java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L5d
                    r8.<init>()     // Catch: java.lang.Throwable -> L5d
                    if (r0 == 0) goto L4c
                    boolean r9 = r0.isEmpty()     // Catch: java.lang.Throwable -> L5d
                    if (r9 != 0) goto L4c
                    int r9 = r0.size()     // Catch: java.lang.Throwable -> L5d
                L35:
                    if (r7 >= r9) goto L4c
                    java.lang.Object r10 = r0.get(r7)     // Catch: java.lang.Throwable -> L5d
                    android.net.Uri r10 = (android.net.Uri) r10     // Catch: java.lang.Throwable -> L5d
                    java.lang.String r11 = ".jpg"
                    android.net.Uri r10 = r1.a(r10, r11)     // Catch: java.lang.Throwable -> L5d
                    if (r10 != 0) goto L46
                    goto L5f
                L46:
                    r8.add(r10)     // Catch: java.lang.Throwable -> L5d
                    int r7 = r7 + 1
                    goto L35
                L4c:
                    if (r5 == 0) goto L58
                    java.lang.String r0 = ".pdf"
                    android.net.Uri r0 = r1.a(r5, r0)     // Catch: java.lang.Throwable -> L5d
                    if (r0 != 0) goto L57
                    goto L5f
                L57:
                    r4 = r0
                L58:
                    ya.d r4 = ya.d.d(r8, r4, r6)     // Catch: java.lang.Throwable -> L5d
                    goto L5f
                L5d:
                    r0 = move-exception
                    goto L7b
                L5f:
                    com.google.android.gms.tasks.TaskCompletionSource r0 = r4
                    if (r4 != 0) goto L6e
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L5d
                    java.lang.String r5 = "Failed to handle result"
                    r4.<init>(r5)     // Catch: java.lang.Throwable -> L5d
                    r0.setException(r4)     // Catch: java.lang.Throwable -> L5d
                    goto L71
                L6e:
                    r0.setResult(r4)     // Catch: java.lang.Throwable -> L5d
                L71:
                    if (r2 == 0) goto L7a
                    java.lang.String r0 = r2.getStringExtra(r3)
                    r1.d(r0)
                L7a:
                    return
                L7b:
                    if (r2 != 0) goto L7e
                    goto L85
                L7e:
                    java.lang.String r2 = r2.getStringExtra(r3)
                    r1.d(r2)
                L85:
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: za.b.run():void");
            }
        });
        return taskCompletionSource.getTask();
    }

    final void d(final String str) {
        if (str == null) {
            return;
        }
        try {
            Tasks.await(new f(this.f24306a).doRead(j.a().d(i.f22719u).b(new v8.j() { // from class: za.d
                @Override // v8.j
                public final void accept(Object obj, Object obj2) {
                    int i10 = f.f24311d;
                    ((zzsg) ((g) obj).getService()).zzc(str);
                    ((TaskCompletionSource) obj2).setResult(null);
                }
            }).e(24337).a()));
        } catch (InterruptedException | ExecutionException e10) {
            e("Failed to cleanup GMS Core cache", e10);
        }
    }
}
