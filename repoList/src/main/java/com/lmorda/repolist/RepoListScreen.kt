package com.lmorda.repolist

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.lmorda.coreui.ListDetailsTheme

@Composable
fun RepoListScreen() {
    ListDetailsTheme {
        Text("Repos List Goes Here")
    }
}

@Preview
@Composable
fun RepoListScreenPreview() {
    RepoListScreen()
}