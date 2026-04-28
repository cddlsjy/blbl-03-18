package blbl.cat3399.core.tv

import android.view.KeyEvent

object RemoteKeys {
    fun isRefreshKey(keyCode: Int): Boolean {
        return keyCode == KeyEvent.KEYCODE_REFRESH ||
            keyCode == KeyEvent.KEYCODE_F5 ||
            keyCode == KeyEvent.KEYCODE_MENU
    }

    fun isNavigationUpKey(keyCode: Int): Boolean {
        return keyCode == KeyEvent.KEYCODE_DPAD_UP ||
            keyCode == KeyEvent.KEYCODE_CHANNEL_UP ||
            keyCode == KeyEvent.KEYCODE_PAGE_UP
    }

    fun isNavigationDownKey(keyCode: Int): Boolean {
        return keyCode == KeyEvent.KEYCODE_DPAD_DOWN ||
            keyCode == KeyEvent.KEYCODE_CHANNEL_DOWN ||
            keyCode == KeyEvent.KEYCODE_PAGE_DOWN
    }
}
