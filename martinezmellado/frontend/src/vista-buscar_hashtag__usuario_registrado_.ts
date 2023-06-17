import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-scroller.js';

@customElement('vista-buscar_hashtag__usuario_registrado_')
export class VistaBuscar_hashtag__usuario_registrado_ extends LitElement {
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
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%; position: absolute;">
 <div id="divCabecera" style="width: 100%; height: 5%;"></div>
 <vaadin-horizontal-layout style="width: 100%; height: 95%;">
  <vaadin-vertical-layout style="width: 60%; height: 100%;">
   <div style="width: 100%; height: 100%;">
    <vaadin-scroller id="scroller" style="width: 100%; height: 100%;"></vaadin-scroller>
   </div>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 40%; height: 100%; align-items: center; justify-content: center;">
   <vaadin-text-field id="tfBusqueda" style="width: 60%;"></vaadin-text-field>
   <vaadin-button id="bBuscarUsuario" style="width: 60%;">
     Buscar usuario 
   </vaadin-button>
   <vaadin-button id="bBuscarHashtag" style="width: 60%;">
     Buscar hashtag 
   </vaadin-button>
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
