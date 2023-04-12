import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-cabecera__administrador_';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@polymer/iron-icon/iron-icon.js';
import './vista-me_gusta__administrador_';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-ver_me_gustas__administrador_')
export class VistaVer_me_gustas__administrador_ extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vista-cabecera__administrador_ style="width: 100%; height: 5%;"></vista-cabecera__administrador_>
 <vaadin-horizontal-layout style="width: 100%; height: 95%;">
  <vaadin-vertical-layout style="width: 60%; height: 100%; align-items: center; justify-content: center;">
   <img style="width: 90%; height: 90%;" src="../../resources/icons/video.svg">
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 40%; height: 100%; align-items: center; justify-content: center;">
   <iron-icon style="width: 20%; height: 12%;" src="../../resources/icons/user.svg"></iron-icon>
   <label>Usuario</label>
   <vaadin-horizontal-layout style="justify-content: space-around; width: 60%; height: 5%; align-items: center;">
    <label>Fecha</label>
    <label>Ubicacion</label>
   </vaadin-horizontal-layout>
   <label style="margin-top: var(--lumo-space-m); margin-bottom: var(--lumo-space-m);">Descripcion </label>
   <label>Me gustas</label>
   <vista-me_gusta__administrador_ style="width: 90%; height: 40%;"></vista-me_gusta__administrador_>
   <vaadin-horizontal-layout theme="spacing-l" style="margin-top: var(--lumo-space-m); justify-content: flex-end; width: 90%;">
    <vaadin-button>
      Anterior 
    </vaadin-button>
    <vaadin-button>
      Eliminar 
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
