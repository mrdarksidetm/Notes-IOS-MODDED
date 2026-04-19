package io.flutter.view;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.Keep;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@Keep
class AccessibilityViewEmbedder {
    private static final String TAG = "AccessibilityBridge";
    private int nextFlutterId;
    private final View rootAccessibilityView;
    private final b reflectionAccessors = new b();
    private final SparseArray<c> flutterIdToOrigin = new SparseArray<>();
    private final Map<c, Integer> originToFlutterId = new HashMap();
    private final Map<View, Rect> embeddedViewToDisplayBounds = new HashMap();

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f13163a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Method f13164b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Method f13165c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Method f13166d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Field f13167e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Method f13168f;

        /* JADX WARN: Multi-variable type inference failed */
        @SuppressLint({"DiscouragedPrivateApi,PrivateApi"})
        private b() throws NoSuchMethodException {
            Method method;
            Method method2;
            Method method3;
            Method method4;
            Field field;
            Method method5;
            Method method6 = null;
            try {
                method = AccessibilityNodeInfo.class.getMethod("getSourceNodeId", new Class[0]);
            } catch (NoSuchMethodException unused) {
                cc.b.g(AccessibilityViewEmbedder.TAG, "can't invoke AccessibilityNodeInfo#getSourceNodeId with reflection");
                method = null;
            }
            try {
                method2 = AccessibilityRecord.class.getMethod("getSourceNodeId", new Class[0]);
            } catch (NoSuchMethodException unused2) {
                cc.b.g(AccessibilityViewEmbedder.TAG, "can't invoke AccessibiiltyRecord#getSourceNodeId with reflection");
                method2 = null;
            }
            if (Build.VERSION.SDK_INT > 26) {
                try {
                    Field declaredField = AccessibilityNodeInfo.class.getDeclaredField("mChildNodeIds");
                    declaredField.setAccessible(true);
                    method4 = Class.forName("android.util.LongArray").getMethod(com.amazon.a.a.o.b.au, Integer.TYPE);
                    method3 = null;
                    field = declaredField;
                } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException unused3) {
                    cc.b.g(AccessibilityViewEmbedder.TAG, "can't access childNodeIdsField with reflection");
                    method3 = null;
                    method4 = null;
                    field = method4;
                }
                this.f13163a = method;
                this.f13164b = method6;
                this.f13165c = method2;
                this.f13166d = method3;
                this.f13167e = field;
                this.f13168f = method4;
            }
            try {
                method5 = AccessibilityNodeInfo.class.getMethod("getParentNodeId", new Class[0]);
            } catch (NoSuchMethodException unused4) {
                cc.b.g(AccessibilityViewEmbedder.TAG, "can't invoke getParentNodeId with reflection");
                method5 = null;
            }
            try {
                method3 = AccessibilityNodeInfo.class.getMethod("getChildId", Integer.TYPE);
                method4 = null;
            } catch (NoSuchMethodException unused5) {
                cc.b.g(AccessibilityViewEmbedder.TAG, "can't invoke getChildId with reflection");
                method3 = null;
                method4 = null;
            }
            method6 = method5;
            field = method4;
            this.f13163a = method;
            this.f13164b = method6;
            this.f13165c = method2;
            this.f13166d = method3;
            this.f13167e = field;
            this.f13168f = method4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Long f(AccessibilityNodeInfo accessibilityNodeInfo, int i10) {
            String str;
            Method method = this.f13166d;
            if (method == null && (this.f13167e == null || this.f13168f == null)) {
                return null;
            }
            if (method != null) {
                try {
                    return (Long) method.invoke(accessibilityNodeInfo, Integer.valueOf(i10));
                } catch (IllegalAccessException e10) {
                    e = e10;
                    str = "Failed to access getChildId method.";
                } catch (InvocationTargetException e11) {
                    e = e11;
                    str = "The getChildId method threw an exception when invoked.";
                }
            } else {
                try {
                    return Long.valueOf(((Long) this.f13168f.invoke(this.f13167e.get(accessibilityNodeInfo), Integer.valueOf(i10))).longValue());
                } catch (ArrayIndexOutOfBoundsException e12) {
                    e = e12;
                    str = "The longArrayGetIndex method threw an exception when invoked.";
                    cc.b.h(AccessibilityViewEmbedder.TAG, str, e);
                    return null;
                } catch (IllegalAccessException e13) {
                    e = e13;
                    str = "Failed to access longArrayGetIndex method or the childNodeId field.";
                } catch (InvocationTargetException e14) {
                    e = e14;
                    str = "The longArrayGetIndex method threw an exception when invoked.";
                    cc.b.h(AccessibilityViewEmbedder.TAG, str, e);
                    return null;
                }
            }
            cc.b.h(AccessibilityViewEmbedder.TAG, str, e);
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Long g(AccessibilityNodeInfo accessibilityNodeInfo) {
            String str;
            Method method = this.f13164b;
            if (method != null) {
                try {
                    return Long.valueOf(((Long) method.invoke(accessibilityNodeInfo, new Object[0])).longValue());
                } catch (IllegalAccessException e10) {
                    e = e10;
                    str = "Failed to access getParentNodeId method.";
                    cc.b.h(AccessibilityViewEmbedder.TAG, str, e);
                    return l(accessibilityNodeInfo);
                } catch (InvocationTargetException e11) {
                    e = e11;
                    str = "The getParentNodeId method threw an exception when invoked.";
                    cc.b.h(AccessibilityViewEmbedder.TAG, str, e);
                    return l(accessibilityNodeInfo);
                }
            }
            return l(accessibilityNodeInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Long h(AccessibilityRecord accessibilityRecord) {
            String str;
            Method method = this.f13165c;
            if (method == null) {
                return null;
            }
            try {
                return (Long) method.invoke(accessibilityRecord, new Object[0]);
            } catch (IllegalAccessException e10) {
                e = e10;
                str = "Failed to access the getRecordSourceNodeId method.";
                cc.b.h(AccessibilityViewEmbedder.TAG, str, e);
                return null;
            } catch (InvocationTargetException e11) {
                e = e11;
                str = "The getRecordSourceNodeId method threw an exception when invoked.";
                cc.b.h(AccessibilityViewEmbedder.TAG, str, e);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Long i(AccessibilityNodeInfo accessibilityNodeInfo) {
            String str;
            Method method = this.f13163a;
            if (method == null) {
                return null;
            }
            try {
                return (Long) method.invoke(accessibilityNodeInfo, new Object[0]);
            } catch (IllegalAccessException e10) {
                e = e10;
                str = "Failed to access getSourceNodeId method.";
                cc.b.h(AccessibilityViewEmbedder.TAG, str, e);
                return null;
            } catch (InvocationTargetException e11) {
                e = e11;
                str = "The getSourceNodeId method threw an exception when invoked.";
                cc.b.h(AccessibilityViewEmbedder.TAG, str, e);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int j(long j10) {
            return (int) (j10 >> 32);
        }

        private static boolean k(long j10, int i10) {
            return (j10 & (1 << i10)) != 0;
        }

        private static Long l(AccessibilityNodeInfo accessibilityNodeInfo) {
            if (Build.VERSION.SDK_INT < 26) {
                cc.b.g(AccessibilityViewEmbedder.TAG, "Unexpected Android version. Unable to find the parent ID.");
                return null;
            }
            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.setDataPosition(0);
            accessibilityNodeInfoObtain.writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            long j10 = parcelObtain.readLong();
            if (k(j10, 0)) {
                parcelObtain.readInt();
            }
            if (k(j10, 1)) {
                parcelObtain.readLong();
            }
            if (k(j10, 2)) {
                parcelObtain.readInt();
            }
            Long lValueOf = k(j10, 3) ? Long.valueOf(parcelObtain.readLong()) : null;
            parcelObtain.recycle();
            return lValueOf;
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final View f13169a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f13170b;

        private c(View view, int i10) {
            this.f13169a = view;
            this.f13170b = i10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f13170b == cVar.f13170b && this.f13169a.equals(cVar.f13169a);
        }

        public int hashCode() {
            return ((this.f13169a.hashCode() + 31) * 31) + this.f13170b;
        }
    }

    AccessibilityViewEmbedder(View view, int i10) {
        this.rootAccessibilityView = view;
        this.nextFlutterId = i10;
    }

    private void addChildrenToFlutterNode(AccessibilityNodeInfo accessibilityNodeInfo, View view, AccessibilityNodeInfo accessibilityNodeInfo2) {
        int iIntValue;
        for (int i10 = 0; i10 < accessibilityNodeInfo.getChildCount(); i10++) {
            Long lF = this.reflectionAccessors.f(accessibilityNodeInfo, i10);
            if (lF != null) {
                int iJ = b.j(lF.longValue());
                c cVar = new c(view, iJ);
                if (this.originToFlutterId.containsKey(cVar)) {
                    iIntValue = this.originToFlutterId.get(cVar).intValue();
                } else {
                    int i11 = this.nextFlutterId;
                    this.nextFlutterId = i11 + 1;
                    cacheVirtualIdMappings(view, iJ, i11);
                    iIntValue = i11;
                }
                accessibilityNodeInfo2.addChild(this.rootAccessibilityView, iIntValue);
            }
        }
    }

    private void cacheVirtualIdMappings(View view, int i10, int i11) {
        c cVar = new c(view, i10);
        this.originToFlutterId.put(cVar, Integer.valueOf(i11));
        this.flutterIdToOrigin.put(i11, cVar);
    }

    private AccessibilityNodeInfo convertToFlutterNode(AccessibilityNodeInfo accessibilityNodeInfo, int i10, View view) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(this.rootAccessibilityView, i10);
        accessibilityNodeInfoObtain.setPackageName(this.rootAccessibilityView.getContext().getPackageName());
        accessibilityNodeInfoObtain.setSource(this.rootAccessibilityView, i10);
        accessibilityNodeInfoObtain.setClassName(accessibilityNodeInfo.getClassName());
        Rect rect = this.embeddedViewToDisplayBounds.get(view);
        copyAccessibilityFields(accessibilityNodeInfo, accessibilityNodeInfoObtain);
        setFlutterNodesTranslateBounds(accessibilityNodeInfo, rect, accessibilityNodeInfoObtain);
        addChildrenToFlutterNode(accessibilityNodeInfo, view, accessibilityNodeInfoObtain);
        setFlutterNodeParent(accessibilityNodeInfo, view, accessibilityNodeInfoObtain);
        return accessibilityNodeInfoObtain;
    }

    private void copyAccessibilityFields(AccessibilityNodeInfo accessibilityNodeInfo, AccessibilityNodeInfo accessibilityNodeInfo2) {
        accessibilityNodeInfo2.setAccessibilityFocused(accessibilityNodeInfo.isAccessibilityFocused());
        accessibilityNodeInfo2.setCheckable(accessibilityNodeInfo.isCheckable());
        accessibilityNodeInfo2.setChecked(accessibilityNodeInfo.isChecked());
        accessibilityNodeInfo2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityNodeInfo2.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityNodeInfo2.setClickable(accessibilityNodeInfo.isClickable());
        accessibilityNodeInfo2.setFocusable(accessibilityNodeInfo.isFocusable());
        accessibilityNodeInfo2.setFocused(accessibilityNodeInfo.isFocused());
        accessibilityNodeInfo2.setLongClickable(accessibilityNodeInfo.isLongClickable());
        accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfo.getMovementGranularities());
        accessibilityNodeInfo2.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityNodeInfo2.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityNodeInfo2.setSelected(accessibilityNodeInfo.isSelected());
        accessibilityNodeInfo2.setText(accessibilityNodeInfo.getText());
        accessibilityNodeInfo2.setVisibleToUser(accessibilityNodeInfo.isVisibleToUser());
        accessibilityNodeInfo2.setEditable(accessibilityNodeInfo.isEditable());
        accessibilityNodeInfo2.setCanOpenPopup(accessibilityNodeInfo.canOpenPopup());
        accessibilityNodeInfo2.setCollectionInfo(accessibilityNodeInfo.getCollectionInfo());
        accessibilityNodeInfo2.setCollectionItemInfo(accessibilityNodeInfo.getCollectionItemInfo());
        accessibilityNodeInfo2.setContentInvalid(accessibilityNodeInfo.isContentInvalid());
        accessibilityNodeInfo2.setDismissable(accessibilityNodeInfo.isDismissable());
        accessibilityNodeInfo2.setInputType(accessibilityNodeInfo.getInputType());
        accessibilityNodeInfo2.setLiveRegion(accessibilityNodeInfo.getLiveRegion());
        accessibilityNodeInfo2.setMultiLine(accessibilityNodeInfo.isMultiLine());
        accessibilityNodeInfo2.setRangeInfo(accessibilityNodeInfo.getRangeInfo());
        accessibilityNodeInfo2.setError(accessibilityNodeInfo.getError());
        accessibilityNodeInfo2.setMaxTextLength(accessibilityNodeInfo.getMaxTextLength());
        int i10 = Build.VERSION.SDK_INT;
        accessibilityNodeInfo2.setContextClickable(accessibilityNodeInfo.isContextClickable());
        accessibilityNodeInfo2.setDrawingOrder(accessibilityNodeInfo.getDrawingOrder());
        accessibilityNodeInfo2.setImportantForAccessibility(accessibilityNodeInfo.isImportantForAccessibility());
        if (i10 >= 26) {
            accessibilityNodeInfo2.setAvailableExtraData(accessibilityNodeInfo.getAvailableExtraData());
            accessibilityNodeInfo2.setHintText(accessibilityNodeInfo.getHintText());
            accessibilityNodeInfo2.setShowingHintText(accessibilityNodeInfo.isShowingHintText());
        }
    }

    private void setFlutterNodeParent(AccessibilityNodeInfo accessibilityNodeInfo, View view, AccessibilityNodeInfo accessibilityNodeInfo2) {
        Long lG = this.reflectionAccessors.g(accessibilityNodeInfo);
        if (lG == null) {
            return;
        }
        Integer num = this.originToFlutterId.get(new c(view, b.j(lG.longValue())));
        if (num != null) {
            accessibilityNodeInfo2.setParent(this.rootAccessibilityView, num.intValue());
        }
    }

    private void setFlutterNodesTranslateBounds(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect, AccessibilityNodeInfo accessibilityNodeInfo2) {
        Rect rect2 = new Rect();
        accessibilityNodeInfo.getBoundsInParent(rect2);
        accessibilityNodeInfo2.setBoundsInParent(rect2);
        Rect rect3 = new Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect3);
        rect3.offset(rect.left, rect.top);
        accessibilityNodeInfo2.setBoundsInScreen(rect3);
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
        AccessibilityNodeInfo accessibilityNodeInfoCreateAccessibilityNodeInfo;
        c cVar = this.flutterIdToOrigin.get(i10);
        if (cVar == null || !this.embeddedViewToDisplayBounds.containsKey(cVar.f13169a) || cVar.f13169a.getAccessibilityNodeProvider() == null || (accessibilityNodeInfoCreateAccessibilityNodeInfo = cVar.f13169a.getAccessibilityNodeProvider().createAccessibilityNodeInfo(cVar.f13170b)) == null) {
            return null;
        }
        return convertToFlutterNode(accessibilityNodeInfoCreateAccessibilityNodeInfo, i10, cVar.f13169a);
    }

    public Integer getRecordFlutterId(View view, AccessibilityRecord accessibilityRecord) {
        Long lH = this.reflectionAccessors.h(accessibilityRecord);
        if (lH == null) {
            return null;
        }
        return this.originToFlutterId.get(new c(view, b.j(lH.longValue())));
    }

    public AccessibilityNodeInfo getRootNode(View view, int i10, Rect rect) {
        AccessibilityNodeInfo accessibilityNodeInfoCreateAccessibilityNodeInfo = view.createAccessibilityNodeInfo();
        Long lI = this.reflectionAccessors.i(accessibilityNodeInfoCreateAccessibilityNodeInfo);
        if (lI == null) {
            return null;
        }
        this.embeddedViewToDisplayBounds.put(view, rect);
        cacheVirtualIdMappings(view, b.j(lI.longValue()), i10);
        return convertToFlutterNode(accessibilityNodeInfoCreateAccessibilityNodeInfo, i10, view);
    }

    public boolean onAccessibilityHoverEvent(int i10, MotionEvent motionEvent) {
        c cVar = this.flutterIdToOrigin.get(i10);
        if (cVar == null) {
            return false;
        }
        Rect rect = this.embeddedViewToDisplayBounds.get(cVar.f13169a);
        int pointerCount = motionEvent.getPointerCount();
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i11 = 0; i11 < motionEvent.getPointerCount(); i11++) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerPropertiesArr[i11] = pointerProperties;
            motionEvent.getPointerProperties(i11, pointerProperties);
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            motionEvent.getPointerCoords(i11, pointerCoords);
            MotionEvent.PointerCoords pointerCoords2 = new MotionEvent.PointerCoords(pointerCoords);
            pointerCoordsArr[i11] = pointerCoords2;
            pointerCoords2.x -= rect.left;
            pointerCoords2.y -= rect.top;
        }
        return cVar.f13169a.dispatchGenericMotionEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getPointerCount(), pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags()));
    }

    public boolean performAction(int i10, int i11, Bundle bundle) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        c cVar = this.flutterIdToOrigin.get(i10);
        if (cVar == null || (accessibilityNodeProvider = cVar.f13169a.getAccessibilityNodeProvider()) == null) {
            return false;
        }
        return accessibilityNodeProvider.performAction(cVar.f13170b, i11, bundle);
    }

    public View platformViewOfNode(int i10) {
        c cVar = this.flutterIdToOrigin.get(i10);
        if (cVar == null) {
            return null;
        }
        return cVar.f13169a;
    }

    public boolean requestSendAccessibilityEvent(View view, View view2, AccessibilityEvent accessibilityEvent) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(accessibilityEvent);
        Long lH = this.reflectionAccessors.h(accessibilityEvent);
        if (lH == null) {
            return false;
        }
        int iJ = b.j(lH.longValue());
        Integer numValueOf = this.originToFlutterId.get(new c(view, iJ));
        if (numValueOf == null) {
            int i10 = this.nextFlutterId;
            this.nextFlutterId = i10 + 1;
            numValueOf = Integer.valueOf(i10);
            cacheVirtualIdMappings(view, iJ, numValueOf.intValue());
        }
        accessibilityEventObtain.setSource(this.rootAccessibilityView, numValueOf.intValue());
        accessibilityEventObtain.setClassName(accessibilityEvent.getClassName());
        accessibilityEventObtain.setPackageName(accessibilityEvent.getPackageName());
        for (int i11 = 0; i11 < accessibilityEventObtain.getRecordCount(); i11++) {
            AccessibilityRecord record = accessibilityEventObtain.getRecord(i11);
            Long lH2 = this.reflectionAccessors.h(record);
            if (lH2 == null) {
                return false;
            }
            c cVar = new c(view, b.j(lH2.longValue()));
            if (!this.originToFlutterId.containsKey(cVar)) {
                return false;
            }
            record.setSource(this.rootAccessibilityView, this.originToFlutterId.get(cVar).intValue());
        }
        return this.rootAccessibilityView.getParent().requestSendAccessibilityEvent(view2, accessibilityEventObtain);
    }
}
