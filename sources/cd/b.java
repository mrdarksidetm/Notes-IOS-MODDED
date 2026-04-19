package cd;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
class b {
    b() {
    }

    private static void a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                outputStream.flush();
                return;
            }
            outputStream.write(bArr, 0, i10);
        }
    }

    private static String b(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        return iLastIndexOf < 0 ? str : str.substring(0, iLastIndexOf);
    }

    private static String c(Context context, Uri uri) {
        try {
            String extensionFromMimeType = uri.getScheme().equals("content") ? MimeTypeMap.getSingleton().getExtensionFromMimeType(context.getContentResolver().getType(uri)) : MimeTypeMap.getFileExtensionFromUrl(Uri.fromFile(new File(uri.getPath())).toString());
            if (extensionFromMimeType != null && !extensionFromMimeType.isEmpty()) {
                return "." + h(extensionFromMimeType);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    private static String d(Context context, Uri uri) {
        Cursor cursorF = f(context, uri);
        if (cursorF != null) {
            try {
                if (cursorF.moveToFirst() && cursorF.getColumnCount() >= 1) {
                    String strH = h(cursorF.getString(0));
                    cursorF.close();
                    return strH;
                }
            } catch (Throwable th) {
                try {
                    cursorF.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (cursorF != null) {
            cursorF.close();
        }
        return null;
    }

    private static Cursor f(Context context, Uri uri) {
        return context.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
    }

    protected static File g(String str, String str2) {
        File file = new File(str);
        if (file.getCanonicalPath().startsWith(str2)) {
            return file;
        }
        throw new IllegalArgumentException("Trying to open path outside of the expected directory. File: " + file.getCanonicalPath() + " was expected to be within directory: " + str2 + ".");
    }

    protected static String h(String str) {
        if (str == null) {
            return null;
        }
        String[] strArr = {"..", "/"};
        String strReplace = str.split("/")[r5.length - 1];
        for (int i10 = 0; i10 < 2; i10++) {
            strReplace = strReplace.replace(strArr[i10], "_");
        }
        return strReplace;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008a A[Catch: IOException | IllegalArgumentException | SecurityException -> 0x00a4, IOException | IllegalArgumentException | SecurityException -> 0x00a4, IOException | IllegalArgumentException | SecurityException -> 0x00a4, TRY_ENTER, TRY_LEAVE, TryCatch #2 {IOException | IllegalArgumentException | SecurityException -> 0x00a4, blocks: (B:3:0x0001, B:17:0x008a, B:17:0x008a, B:17:0x008a, B:31:0x00a3, B:31:0x00a3, B:31:0x00a3, B:30:0x00a0, B:30:0x00a0, B:30:0x00a0), top: B:36:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    java.lang.String e(android.content.Context r7, android.net.Uri r8) {
        /*
            r6 = this;
            r0 = 0
            android.content.ContentResolver r1 = r7.getContentResolver()     // Catch: java.lang.Throwable -> La4
            java.io.InputStream r1 = r1.openInputStream(r8)     // Catch: java.lang.Throwable -> La4
            java.util.UUID r2 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L98
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L98
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L98
            java.io.File r4 = r7.getCacheDir()     // Catch: java.lang.Throwable -> L98
            r3.<init>(r4, r2)     // Catch: java.lang.Throwable -> L98
            r3.mkdir()     // Catch: java.lang.Throwable -> L98
            r3.deleteOnExit()     // Catch: java.lang.Throwable -> L98
            java.lang.String r2 = d(r7, r8)     // Catch: java.lang.Throwable -> L98
            java.lang.String r7 = c(r7, r8)     // Catch: java.lang.Throwable -> L98
            if (r2 != 0) goto L56
            java.lang.String r2 = "FileUtils"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L98
            r4.<init>()     // Catch: java.lang.Throwable -> L98
            java.lang.String r5 = "Cannot get file name for "
            r4.append(r5)     // Catch: java.lang.Throwable -> L98
            r4.append(r8)     // Catch: java.lang.Throwable -> L98
            java.lang.String r8 = r4.toString()     // Catch: java.lang.Throwable -> L98
            cc.b.g(r2, r8)     // Catch: java.lang.Throwable -> L98
            if (r7 != 0) goto L44
            java.lang.String r7 = ".jpg"
        L44:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L98
            r8.<init>()     // Catch: java.lang.Throwable -> L98
            java.lang.String r2 = "image_picker"
            r8.append(r2)     // Catch: java.lang.Throwable -> L98
            r8.append(r7)     // Catch: java.lang.Throwable -> L98
        L51:
            java.lang.String r2 = r8.toString()     // Catch: java.lang.Throwable -> L98
            goto L68
        L56:
            if (r7 == 0) goto L68
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L98
            r8.<init>()     // Catch: java.lang.Throwable -> L98
            java.lang.String r2 = b(r2)     // Catch: java.lang.Throwable -> L98
            r8.append(r2)     // Catch: java.lang.Throwable -> L98
            r8.append(r7)     // Catch: java.lang.Throwable -> L98
            goto L51
        L68:
            java.io.File r7 = new java.io.File     // Catch: java.lang.Throwable -> L98
            r7.<init>(r3, r2)     // Catch: java.lang.Throwable -> L98
            java.lang.String r7 = r7.getPath()     // Catch: java.lang.Throwable -> L98
            java.lang.String r8 = r3.getCanonicalPath()     // Catch: java.lang.Throwable -> L98
            java.io.File r7 = g(r7, r8)     // Catch: java.lang.Throwable -> L98
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L98
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L98
            a(r1, r8)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r7 = r7.getPath()     // Catch: java.lang.Throwable -> L8e
            r8.close()     // Catch: java.lang.Throwable -> L98
            if (r1 == 0) goto L8d
            r1.close()     // Catch: java.lang.Throwable -> La4 java.lang.Throwable -> La4 java.lang.Throwable -> La4
        L8d:
            return r7
        L8e:
            r7 = move-exception
            r8.close()     // Catch: java.lang.Throwable -> L93
            goto L97
        L93:
            r8 = move-exception
            r7.addSuppressed(r8)     // Catch: java.lang.Throwable -> L98
        L97:
            throw r7     // Catch: java.lang.Throwable -> L98
        L98:
            r7 = move-exception
            if (r1 == 0) goto La3
            r1.close()     // Catch: java.lang.Throwable -> L9f
            goto La3
        L9f:
            r8 = move-exception
            r7.addSuppressed(r8)     // Catch: java.lang.Throwable -> La4 java.lang.Throwable -> La4 java.lang.Throwable -> La4
        La3:
            throw r7     // Catch: java.lang.Throwable -> La4 java.lang.Throwable -> La4 java.lang.Throwable -> La4
        La4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cd.b.e(android.content.Context, android.net.Uri):java.lang.String");
    }
}
