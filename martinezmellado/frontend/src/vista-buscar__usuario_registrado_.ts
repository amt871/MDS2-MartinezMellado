import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-buscar__usuario_registrado_')
export class VistaBuscar__usuario_registrado_ extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; position: absolute;">
 <vaadin-vertical-layout style="width: 100%; height: 5%;">
  <div id="divCabecera" style="height: 100%; width: 100%;"></div>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout style="height: 95%; width: 100%;">
  <vaadin-vertical-layout style="width: 70%; height: 95%; justify-content: center; align-items: center;">
   <vaadin-vertical-layout style="justify-content: center; width: 100%; height: 45%; align-items: center; flex-shrink: 1; flex-grow: 0;">
    <label style="padding-bottom: var(--lumo-space-s);">Usuarios recientes</label>
    <div id="divUsuarios" style="width: 100%; height: 100%; position: relative;"></div>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 100%; align-items: center; justify-content: center; height: 45%;">
    <label style="padding-bottom: var(--lumo-space-s);">Videos mas recientes </label>
    <div id="divVideos" style="width: 100%; height: 100%; position: relative;"></div>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 30%; height: 100%; align-items: center;">
   <vaadin-text-field style="padding-top: var(--lumo-space-m);" id="inTextField"></vaadin-text-field>
   <vaadin-button id="bUsuario">
     Buscar usuario 
   </vaadin-button>
   <vaadin-button id="bHashtag">
     Buscar Hashtag 
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
