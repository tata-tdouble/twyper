package com.github.theapache64.twyper

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember


/**
 * To control the Twyper.
 * Used to swipe card programmatically
 */
@Composable
fun rememberTwyperController(): TwyperController {
    return remember { TwyperControllerImpl() }
}

interface TwyperController {
    /**
     * Points to the top card's [CardController]
     */
    var currentCardController: CardController?
    fun swipeRight()
    fun swipeLeft()
    fun swipeUp()
    fun swipeDown()
}

class TwyperControllerImpl : TwyperController {
    override var currentCardController: CardController? = null

    override fun swipeRight() {
        currentCardController?.swipeRight()
    }

    override fun swipeLeft() {
        currentCardController?.swipeLeft()
    }

    override fun swipeUp() {
        currentCardController?.swipeUp()
    }

    override fun swipeDown() {
        currentCardController?.swipeDown()
    }
}