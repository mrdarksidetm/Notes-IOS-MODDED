package io.flutter.plugin.editing;

import android.annotation.TargetApi;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.DynamicLayout;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InputMethodManager;
import com.google.android.gms.common.api.a;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.editing.c;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import rc.s;

/* JADX INFO: loaded from: classes2.dex */
public class b extends BaseInputConnection implements c.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f12984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f12985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s f12986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f12987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final EditorInfo f12988e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ExtractedTextRequest f12989f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f12990g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private CursorAnchorInfo.Builder f12991h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ExtractedText f12992i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private InputMethodManager f12993j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Layout f12994k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private io.flutter.plugin.editing.a f12995l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final a f12996m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f12997n;

    public interface a {
        boolean a(KeyEvent keyEvent);
    }

    public b(View view, int i10, s sVar, a aVar, c cVar, EditorInfo editorInfo) {
        this(view, i10, sVar, aVar, cVar, editorInfo, new FlutterJNI());
    }

    public b(View view, int i10, s sVar, a aVar, c cVar, EditorInfo editorInfo, FlutterJNI flutterJNI) {
        super(view, true);
        this.f12990g = false;
        this.f12992i = new ExtractedText();
        this.f12997n = 0;
        this.f12984a = view;
        this.f12985b = i10;
        this.f12986c = sVar;
        this.f12987d = cVar;
        cVar.a(this);
        this.f12988e = editorInfo;
        this.f12996m = aVar;
        this.f12995l = new io.flutter.plugin.editing.a(flutterJNI);
        this.f12994k = new DynamicLayout(cVar, new TextPaint(), a.e.API_PRIORITY_OTHER, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f12993j = (InputMethodManager) view.getContext().getSystemService("input_method");
    }

    private boolean c(int i10) {
        if (i10 == 16908319) {
            setSelection(0, this.f12987d.length());
            return true;
        }
        if (i10 == 16908320) {
            int selectionStart = Selection.getSelectionStart(this.f12987d);
            int selectionEnd = Selection.getSelectionEnd(this.f12987d);
            if (selectionStart != selectionEnd) {
                int iMin = Math.min(selectionStart, selectionEnd);
                int iMax = Math.max(selectionStart, selectionEnd);
                ((ClipboardManager) this.f12984a.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", this.f12987d.subSequence(iMin, iMax)));
                this.f12987d.delete(iMin, iMax);
                setSelection(iMin, iMin);
            }
            return true;
        }
        if (i10 == 16908321) {
            int selectionStart2 = Selection.getSelectionStart(this.f12987d);
            int selectionEnd2 = Selection.getSelectionEnd(this.f12987d);
            if (selectionStart2 != selectionEnd2) {
                ((ClipboardManager) this.f12984a.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", this.f12987d.subSequence(Math.min(selectionStart2, selectionEnd2), Math.max(selectionStart2, selectionEnd2))));
            }
            return true;
        }
        if (i10 != 16908322) {
            return false;
        }
        ClipData primaryClip = ((ClipboardManager) this.f12984a.getContext().getSystemService("clipboard")).getPrimaryClip();
        if (primaryClip != null) {
            CharSequence charSequenceCoerceToText = primaryClip.getItemAt(0).coerceToText(this.f12984a.getContext());
            int iMax2 = Math.max(0, Selection.getSelectionStart(this.f12987d));
            int iMax3 = Math.max(0, Selection.getSelectionEnd(this.f12987d));
            int iMin2 = Math.min(iMax2, iMax3);
            int iMax4 = Math.max(iMax2, iMax3);
            if (iMin2 != iMax4) {
                this.f12987d.delete(iMin2, iMax4);
            }
            this.f12987d.insert(iMin2, charSequenceCoerceToText);
            int length = iMin2 + charSequenceCoerceToText.length();
            setSelection(length, length);
        }
        return true;
    }

    private CursorAnchorInfo d() {
        CursorAnchorInfo.Builder builder = this.f12991h;
        if (builder == null) {
            this.f12991h = new CursorAnchorInfo.Builder();
        } else {
            builder.reset();
        }
        this.f12991h.setSelectionRange(this.f12987d.i(), this.f12987d.h());
        int iG = this.f12987d.g();
        int iF = this.f12987d.f();
        if (iG < 0 || iF <= iG) {
            this.f12991h.setComposingText(-1, "");
        } else {
            this.f12991h.setComposingText(iG, this.f12987d.toString().subSequence(iG, iF));
        }
        return this.f12991h.build();
    }

    private ExtractedText e(ExtractedTextRequest extractedTextRequest) {
        ExtractedText extractedText = this.f12992i;
        extractedText.startOffset = 0;
        extractedText.partialStartOffset = -1;
        extractedText.partialEndOffset = -1;
        extractedText.selectionStart = this.f12987d.i();
        this.f12992i.selectionEnd = this.f12987d.h();
        this.f12992i.text = (extractedTextRequest == null || (extractedTextRequest.flags & 1) == 0) ? this.f12987d.toString() : this.f12987d;
        return this.f12992i;
    }

    private boolean f(boolean z10, boolean z11) {
        int selectionStart = Selection.getSelectionStart(this.f12987d);
        int selectionEnd = Selection.getSelectionEnd(this.f12987d);
        boolean z12 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        int iMax = z10 ? Math.max(this.f12995l.b(this.f12987d, selectionEnd), 0) : Math.min(this.f12995l.a(this.f12987d, selectionEnd), this.f12987d.length());
        if (selectionStart == selectionEnd && !z11) {
            z12 = true;
        }
        if (z12) {
            setSelection(iMax, iMax);
        } else {
            setSelection(selectionStart, iMax);
        }
        return true;
    }

    private boolean h(boolean z10, boolean z11) {
        int selectionStart = Selection.getSelectionStart(this.f12987d);
        int selectionEnd = Selection.getSelectionEnd(this.f12987d);
        boolean z12 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        if (selectionStart == selectionEnd && !z11) {
            z12 = true;
        }
        beginBatchEdit();
        if (z12) {
            if (z10) {
                Selection.moveUp(this.f12987d, this.f12994k);
            } else {
                Selection.moveDown(this.f12987d, this.f12994k);
            }
            int selectionStart2 = Selection.getSelectionStart(this.f12987d);
            setSelection(selectionStart2, selectionStart2);
        } else {
            if (z10) {
                Selection.extendUp(this.f12987d, this.f12994k);
            } else {
                Selection.extendDown(this.f12987d, this.f12994k);
            }
            setSelection(Selection.getSelectionStart(this.f12987d), Selection.getSelectionEnd(this.f12987d));
        }
        endBatchEdit();
        return true;
    }

    private byte[] i(InputStream inputStream, int i10) {
        int i11;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[i10];
        while (true) {
            try {
                i11 = inputStream.read(bArr);
            } catch (IOException unused) {
                i11 = -1;
            }
            if (i11 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i11);
        }
    }

    @Override // io.flutter.plugin.editing.c.b
    public void b(boolean z10, boolean z11, boolean z12) {
        this.f12993j.updateSelection(this.f12984a, this.f12987d.i(), this.f12987d.h(), this.f12987d.g(), this.f12987d.f());
        ExtractedTextRequest extractedTextRequest = this.f12989f;
        if (extractedTextRequest != null) {
            this.f12993j.updateExtractedText(this.f12984a, extractedTextRequest.token, e(extractedTextRequest));
        }
        if (this.f12990g) {
            this.f12993j.updateCursorAnchorInfo(this.f12984a, d());
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        this.f12987d.b();
        this.f12997n++;
        return super.beginBatchEdit();
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i10) {
        return super.clearMetaKeyStates(i10);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public void closeConnection() {
        super.closeConnection();
        this.f12987d.l(this);
        while (this.f12997n > 0) {
            endBatchEdit();
            this.f12997n--;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    @TargetApi(25)
    public boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i10 & 1) != 0) {
            try {
                inputContentInfo.requestPermission();
                if (inputContentInfo.getDescription().getMimeTypeCount() > 0) {
                    inputContentInfo.requestPermission();
                    Uri contentUri = inputContentInfo.getContentUri();
                    String mimeType = inputContentInfo.getDescription().getMimeType(0);
                    Context context = this.f12984a.getContext();
                    if (contentUri != null) {
                        try {
                            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(contentUri);
                            if (inputStreamOpenInputStream != null) {
                                byte[] bArrI = i(inputStreamOpenInputStream, 65536);
                                HashMap map = new HashMap();
                                map.put("mimeType", mimeType);
                                map.put("data", bArrI);
                                map.put("uri", contentUri.toString());
                                this.f12986c.b(this.f12985b, map);
                                inputContentInfo.releasePermission();
                                return true;
                            }
                        } catch (FileNotFoundException unused) {
                            inputContentInfo.releasePermission();
                            return false;
                        }
                    }
                    inputContentInfo.releasePermission();
                }
            } catch (Exception unused2) {
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i10) {
        return super.commitText(charSequence, i10);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i10, int i11) {
        if (this.f12987d.i() == -1) {
            return true;
        }
        return super.deleteSurroundingText(i10, i11);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        return super.deleteSurroundingTextInCodePoints(i10, i11);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        boolean zEndBatchEdit = super.endBatchEdit();
        this.f12997n--;
        this.f12987d.d();
        return zEndBatchEdit;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        return super.finishComposingText();
    }

    public boolean g(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            if (keyEvent.getKeyCode() == 21) {
                return f(true, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 22) {
                return f(false, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 19) {
                return h(true, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 20) {
                return h(false, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) {
                EditorInfo editorInfo = this.f12988e;
                if ((131072 & editorInfo.inputType) == 0) {
                    performEditorAction(editorInfo.imeOptions & 255);
                    return true;
                }
            }
            int selectionStart = Selection.getSelectionStart(this.f12987d);
            int selectionEnd = Selection.getSelectionEnd(this.f12987d);
            int unicodeChar = keyEvent.getUnicodeChar();
            if (selectionStart >= 0 && selectionEnd >= 0 && unicodeChar != 0) {
                int iMin = Math.min(selectionStart, selectionEnd);
                int iMax = Math.max(selectionStart, selectionEnd);
                beginBatchEdit();
                if (iMin != iMax) {
                    this.f12987d.delete(iMin, iMax);
                }
                this.f12987d.insert(iMin, (CharSequence) String.valueOf((char) unicodeChar));
                int i10 = iMin + 1;
                setSelection(i10, i10);
                endBatchEdit();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public Editable getEditable() {
        return this.f12987d;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
        boolean z10 = (i10 & 1) != 0;
        if (z10 == (this.f12989f == null)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("The input method toggled text monitoring ");
            sb2.append(z10 ? "on" : "off");
            cc.b.a("InputConnectionAdaptor", sb2.toString());
        }
        this.f12989f = z10 ? extractedTextRequest : null;
        return e(extractedTextRequest);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i10) {
        beginBatchEdit();
        boolean zC = c(i10);
        endBatchEdit();
        return zC;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i10) {
        if (i10 == 0) {
            this.f12986c.o(this.f12985b);
        } else if (i10 == 1) {
            this.f12986c.g(this.f12985b);
        } else if (i10 == 2) {
            this.f12986c.f(this.f12985b);
        } else if (i10 == 3) {
            this.f12986c.l(this.f12985b);
        } else if (i10 == 4) {
            this.f12986c.m(this.f12985b);
        } else if (i10 == 5) {
            this.f12986c.h(this.f12985b);
        } else if (i10 != 7) {
            this.f12986c.e(this.f12985b);
        } else {
            this.f12986c.j(this.f12985b);
        }
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) {
        this.f12986c.i(this.f12985b, str, bundle);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i10) {
        if ((i10 & 1) != 0) {
            this.f12993j.updateCursorAnchorInfo(this.f12984a, d());
        }
        boolean z10 = (i10 & 2) != 0;
        if (z10 != this.f12990g) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("The input method toggled cursor monitoring ");
            sb2.append(z10 ? "on" : "off");
            cc.b.a("InputConnectionAdaptor", sb2.toString());
        }
        this.f12990g = z10;
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        return this.f12996m.a(keyEvent);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i10, int i11) {
        return super.setComposingRegion(i10, i11);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i10) {
        beginBatchEdit();
        boolean zCommitText = charSequence.length() == 0 ? super.commitText(charSequence, i10) : super.setComposingText(charSequence, i10);
        endBatchEdit();
        return zCommitText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setSelection(int i10, int i11) {
        beginBatchEdit();
        boolean selection = super.setSelection(i10, i11);
        endBatchEdit();
        return selection;
    }
}
