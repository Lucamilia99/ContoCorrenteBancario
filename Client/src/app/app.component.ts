import { Component } from '@angular/core';
import { ContoCorrente } from './conto-corrente';
import { ContoCorrenteDto } from './conto-corrente-dto';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  constructor() {

  }

  contoCorrente = new ContoCorrente();

  contiCorrente: ContoCorrente[] = [];

  aggiungi() {
    let dto = new ContoCorrenteDto();
    dto.contoCorrente = this.contoCorrente;

  }
}
