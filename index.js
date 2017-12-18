import { NativeModules, Platform } from 'react-native';

function moveTaskToBack() {
	if (Platform.OS == 'android') {
		NativeModules.RNMoveTaskToBack.moveToBack();
	}
}

export default {
	moveTaskToBack
}