package TataLetak

class TataLetak


    import android.os.Bundle
    import androidx.activity.ComponentActivity
    import androidx.activity.compose.setContent
    import androidx.annotation.DrawableRes
    import androidx.annotation.StringRes
    import androidx.compose.material.*
    import androidx.compose.material.icons.Icons
    import androidx.compose.material.icons.filled.Search
    import androidx.compose.runtime.Composable
    import androidx.compose.ui.Modifier
    import androidx.compose.ui.res.painterResource
    import androidx.compose.ui.res.stringResource
    import androidx.compose.ui.unit.dp
    import com.unmus.androidtraining.Conversation
    import com.unmus.androidtraining.GenerateDataDummyUser
    import com.unmus.androidtraining.R
    import com.unmus.androidtraining.ui.theme.AndroidTrainingTheme
    import androidx.compose.foundation.Image
    import androidx.compose.foundation.layout.*
    import androidx.compose.foundation.shape.CircleShape
    import androidx.compose.ui.Alignment
    import androidx.compose.ui.draw.clip
    import androidx.compose.ui.layout.ContentScale


    class TataLetakActivity : ComponentActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContent {
                AndroidTrainingTheme{
                    Column(){
                        SearchBar()
                        Row(){
                            AlignYourBodyElement(
                                text = R.string.ab1_inversions,
                                drawable = R.drawable.univmusamus
                            )
                            AlignYourBodyElement(
                                text = R.string.ab2_inversions,
                                drawable = R.drawable.univmusamus
                            )
                            AlignYourBodyElement(
                                text = R.string.ab3_inversions,
                                drawable = R.drawable.univmusamus
                            )
                            AlignYourBodyElement(
                                text = R.string.ab4_inversions,
                                drawable = R.drawable.univmusamus
                            )
                        }
                    }
                }
            }
        }
    }

    @Composable
    fun SearchBar(modifier: Modifier = Modifier){
        TextField(
            value = "",
            onValueChange = {},
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = null
                )
            },
            placeholder = {
                Text(stringResource(id = R.string.placeholder_search))
            },
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = MaterialTheme.colors.surface
            ),
            modifier = modifier
                .fillMaxWidth()
                .heightIn(min = 56.dp))
    }


    @Composable
    fun AlignYourBodyElement(
        @DrawableRes drawable: Int,
        @StringRes text: Int,
        modifier: Modifier = Modifier){
        Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(drawable),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(88.dp)
                    .clip(CircleShape)
            )
            Text(
                text = stringResource(text)
            )
        }
    }