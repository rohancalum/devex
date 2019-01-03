'use strict';

import angular, { IController } from 'angular';
import { IAuthenticationService } from '../../services/AuthenticationService';
import { IUser } from '../../../shared/IUserDTO';

export class SettingsController implements IController {
	public static $inject = ['AuthenticationService'];

	public user: IUser;

	constructor(private AuthenticationService: IAuthenticationService) {
		this.user = this.AuthenticationService.user;
	}
}

angular.module('users').controller('SettingsController', SettingsController);
